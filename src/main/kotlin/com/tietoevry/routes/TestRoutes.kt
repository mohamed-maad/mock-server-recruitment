package com.tietoevry.routes

import com.tietoevry.dto.Person
import com.tietoevry.service.TestService
import com.tietoevry.util.MockDatabaseUtil
import io.ktor.server.application.*
import io.ktor.server.auth.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import io.ktor.server.util.*

fun Route.testRouting(testService: TestService) {
    authenticate("auth-jwt") {
        route("test") {
            get("1") {
                call.respond("Test for fake token passed: ${testService.testForFakeToken()}")
            }
            get("2") {
                call.respond("Test for person1: ${testService.testForPerson1()}")
            }
            get("3") {
                call.respond("Test for database content: ${testService.testForDatabaseContent()}")
            }
        }
    }
}