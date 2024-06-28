package com.tietoevry.client

import com.tietoevry.dto.Person
import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.request.*
import io.ktor.client.statement.*
import io.ktor.http.*
import org.slf4j.LoggerFactory

class PersonClient(
    private val client: HttpClient
) {
    suspend fun getPerson(socSecNum: String, token: String): Person? {
        val urlString = "$BASE_URL/person/$socSecNum"
        val url = URLBuilder(urlString).build()

        logger.info("Getting person with socSecNum: $socSecNum")

        val response: HttpResponse = client.get(url) {
            headers {
                append("Authorization", token)
                append("Accept", "application/json")
            }
        }

        return if (response.status.isSuccess()) {
            response.body<Person>()
        } else {
            logger.info("Failed to get person with socSecNum: $socSecNum. HTTP status: ${response.status}")
            null
        }
    }

    companion object {
        const val BASE_URL = "http://localhost:8081"
        private val logger = LoggerFactory.getLogger(PersonClient::class.java)
    }
}