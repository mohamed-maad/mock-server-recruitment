package com.tietoevry.dto

import kotlinx.serialization.Serializable
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.encodeToJsonElement

@Serializable
data class PersonCreatedEvent(
    val name: String,
    val socSecNum: String,
    val address: String,
    val email: String,
    val phone: String,
) {
    fun toJson(): JsonElement {
        return Json.encodeToJsonElement(this)
    }
}
