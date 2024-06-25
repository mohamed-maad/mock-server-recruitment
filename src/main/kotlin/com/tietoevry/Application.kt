package com.tietoevry

import com.tietoevry.plugins.*
import io.ktor.client.*
import io.ktor.client.engine.okhttp.*
import io.ktor.client.plugins.contentnegotiation.*
import io.ktor.serialization.kotlinx.json.*
import io.ktor.server.application.*
import io.ktor.server.auth.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import io.ktor.server.plugins.cors.routing.*

fun main() {
    embeddedServer(Netty, port = 8080, host = "0.0.0.0", module = Application::module)
        .start(wait = true)
}

fun Application.module() {
    install(Authentication) {
        bearer("auth-bearer") {
            realm = "Access to '/'"
            authenticate { tokenCredential ->
                if (tokenCredential.token == "abc") {
                    UserIdPrincipal("user")
                } else {
                    null
                }
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

    configureSerialization()
    configureRouting()
}
