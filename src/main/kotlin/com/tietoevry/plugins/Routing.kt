package com.tietoevry.plugins

import com.tietoevry.dto.Settings
import com.tietoevry.routes.eventRouting
import com.tietoevry.routes.testRouting
import com.tietoevry.routes.tokenRouting
import com.tietoevry.service.DataService
import com.tietoevry.service.TestService
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.configureRouting(dataService: DataService, testService: TestService, settings: Settings) {
    routing {
        get("/") {
            call.respondText("Alive!")
        }

        eventRouting(dataService)
        tokenRouting(settings)
        testRouting(testService)
    }
}
