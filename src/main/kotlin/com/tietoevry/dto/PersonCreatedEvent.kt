package com.tietoevry.dto

import kotlinx.serialization.Serializable
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json

@Serializable
data class PersonCreatedEvent(
    val name: String,
    val socSecNum: String,
    val address: String,
    val email: String,
    val phone: String,
) {
    fun toJson(): String {
        return Json.encodeToString(this).trimIndent()
    }
}
