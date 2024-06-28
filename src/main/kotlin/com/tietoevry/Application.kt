package com.tietoevry

import com.auth0.jwt.JWT
import com.auth0.jwt.algorithms.Algorithm
import com.tietoevry.client.PersonClient
import com.tietoevry.dto.Event
import com.tietoevry.plugins.*
import com.tietoevry.service.DataService
import com.tietoevry.service.TestService
import com.tietoevry.util.SettingsUtil.readSettingsFromJson
import com.tietoevry.util.SplashScreenUtil
import io.ktor.client.*
import io.ktor.client.engine.okhttp.*
import io.ktor.client.plugins.contentnegotiation.*
import io.ktor.http.*
import io.ktor.serialization.kotlinx.json.*
import io.ktor.server.application.*
import io.ktor.server.auth.*
import io.ktor.server.auth.jwt.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import io.ktor.server.plugins.cors.routing.*
import io.ktor.server.response.*
import io.ktor.utils.io.*
import kotlinx.coroutines.flow.Flow

fun main() {
    embeddedServer(Netty, port = 8080, host = "0.0.0.0", module = Application::module)
        .start(wait = true)
}

fun Application.module() {
    SplashScreenUtil.print("1.0.0")
    val settings = readSettingsFromJson("./in/settings.json")

    install(Authentication) {
        jwt("auth-jwt") {
            realm = settings.jwtRealm
            verifier(
                JWT
                .require(Algorithm.HMAC256(settings.jwtSecret))
                .withAudience(settings.jwtAudience)
                .withIssuer(settings.jwtIssuer)
                .build())
            validate { credential ->
                if (credential.payload.getClaim("username").asString() != "") {
                    JWTPrincipal(credential.payload)
                } else {
                    null
                }
            }
            challenge { defaultScheme, realm ->
                call.respond(HttpStatusCode.Unauthorized, "Token is not valid or has expired")
            }
        }
        form("auth-form") {
            userParamName = "username"
            passwordParamName = "password"
            validate { credentials ->
                if (credentials.name == settings.username && credentials.password == settings.password) {
                    UserIdPrincipal(credentials.name)
                } else {
                    null
                }
            }
            challenge {
                call.respond(HttpStatusCode.Unauthorized, "Credentials are not valid")
            }
        }
    }
    install(CORS) {
        anyHost()
    }
    val client = HttpClient(OkHttp) {
        install(ContentNegotiation) {
            json()
        }
    }

    val personClient = PersonClient(client)
    val dataService = DataService()
    val testService = TestService(personClient)

    configureSerialization()
    configureRouting(dataService, testService, settings)
}

suspend fun ApplicationCall.respondSse(eventFlow: Flow<Event>) {
    response.cacheControl(CacheControl.NoCache(null))
    respondBytesWriter(contentType = ContentType.Text.EventStream) {
        eventFlow.collect { event ->
            writeStringUtf8("id: ${event.sequenceNumber}\n")
            writeStringUtf8("event: ${event.eventType}\n")
            writeStringUtf8("data: ${event.toJson()}\n")
            writeStringUtf8("\n")
            flush()
        }
    }
}
