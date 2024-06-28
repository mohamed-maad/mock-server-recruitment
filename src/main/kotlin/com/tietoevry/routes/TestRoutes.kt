package com.tietoevry.routes

import com.tietoevry.service.TestService
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Route.testRouting(testService: TestService) {
    route("test") {
        get("1") {
            call.respond("Test for fake token passed: ${testService.testForFakeToken()}")
        }
        get("2") {
            call.respond("Test for person1 passed: ${testService.testForPerson1()}")
        }
        get("3") {
            call.respond("Test for database content passed: ${testService.testForDatabaseContent()}")
        }
    }
}