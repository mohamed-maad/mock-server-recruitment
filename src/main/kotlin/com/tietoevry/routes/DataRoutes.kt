package com.tietoevry.routes

import com.tietoevry.respondSse
import com.tietoevry.service.DataService
import io.ktor.server.application.*
import io.ktor.server.auth.*
import io.ktor.server.routing.*
import io.ktor.server.util.*

fun Route.dataRouting(dataService: DataService) {
    authenticate("auth-jwt") {
        route("events") {
            get {
                call.respondSse(dataService.eventFlow())
            }
            get("{sequenceNumber}") {
                val sequenceNumber = call.parameters.getOrFail<Long>("sequenceNumber")
                call.respondSse(dataService.eventFlowFromSequenceNumber(sequenceNumber))
            }
        }
    }
}