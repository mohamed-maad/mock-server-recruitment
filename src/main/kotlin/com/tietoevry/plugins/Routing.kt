package com.tietoevry.plugins

import com.tietoevry.dto.Settings
import com.tietoevry.routes.dataRouting
import com.tietoevry.routes.tokenRouting
import com.tietoevry.service.DataService
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.configureRouting(dataService: DataService, settings: Settings) {
    routing {
        get("/") {
            call.respondText("Alive!")
        }

        dataRouting(dataService)
        tokenRouting(settings)
    }
}
