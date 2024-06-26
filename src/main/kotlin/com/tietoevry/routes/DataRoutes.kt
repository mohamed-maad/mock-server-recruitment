package com.tietoevry.routes

import io.ktor.server.application.*
import io.ktor.server.auth.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Route.dataRouting() {
    authenticate("auth-jwt") {
        route("data") {
            get("status") {
                call.respond("El texte")
            }
        }
    }
}