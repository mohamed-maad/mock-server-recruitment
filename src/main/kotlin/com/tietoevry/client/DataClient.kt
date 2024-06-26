package com.tietoevry.client

import com.tietoevry.dto.InboundDTO
import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.request.*
import io.ktor.http.*

class DataClient(
    private val client: HttpClient
) {
    suspend fun getData(): InboundDTO {
        val urlString = "$BASE_URL/Commissions/Inquiries/User"
        val url = URLBuilder(urlString).build()

        return client.get(url) {
            headers {
                append("Authorization", "token")
                append("Accept", "application/json")
            }
        }.body<InboundDTO>()
    }

    companion object {
        const val BASE_URL = "http://localhost:8081"
    }
}