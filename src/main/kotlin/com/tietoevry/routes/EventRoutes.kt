package com.tietoevry.routes

import com.tietoevry.respondSse
import com.tietoevry.service.DataService
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.auth.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import io.ktor.server.util.*

fun Route.eventRouting(dataService: DataService) {
    authenticate("auth-jwt") {
        route("events") {
            get {
                call.respondSse(dataService.eventFlow())
            }
            get("from/{sequenceNumber}") {
                val sequenceNumber = call.parameters.getOrFail<Long>("sequenceNumber")
                val eventFlow = dataService.eventFlowFromSequenceNumber(sequenceNumber)

                if (eventFlow != null) {
                    call.respondSse(eventFlow)
                } else {
                    call.respond(HttpStatusCode.NotFound ,"Event with sequence number $sequenceNumber does not exist.")
                }
            }
            get("{sequenceNumber}") {
                val sequenceNumber = call.parameters.getOrFail<Long>("sequenceNumber")
                val event = dataService.getEvent(sequenceNumber)

                if (event != null) {
                    call.respond(event)
                } else {
                    call.respond(HttpStatusCode.NotFound ,"Event with sequence number $sequenceNumber does not exist.")
                }
            }
        }
    }
}