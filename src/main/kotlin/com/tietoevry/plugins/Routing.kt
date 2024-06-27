package com.tietoevry.plugins

import com.tietoevry.dto.Settings
import com.tietoevry.routes.dataRouting
import com.tietoevry.routes.tokenRouting
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.configureRouting(settings: Settings) {
    routing {
        get("/") {
            call.respondText("Alive!")
        }

        dataRouting()
        tokenRouting(settings)
    }
}
