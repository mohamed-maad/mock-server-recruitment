package com.tietoevry.routes

import com.tietoevry.dto.Settings
import com.tietoevry.util.JwtUtil
import io.ktor.server.application.*
import io.ktor.server.auth.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Route.tokenRouting(settings: Settings) {
    authenticate("auth-form") {
        route("token") {
            post {
                val username = call.principal<UserIdPrincipal>()?.name
                val token = JwtUtil.generateToken(username!!, settings)
                call.respond(hashMapOf("token" to token))
            }
        }
    }
}