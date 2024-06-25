package com.tietoevry.routes

import io.ktor.server.application.*
import io.ktor.server.auth.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Route.tokenRouting() {
    authenticate("auth-bearer") {
        route("control") {
            get("status") {
                call.respond("El texte")
            }
        }
    }
}