package com.tietoevry.dto

import com.tietoevry.types.EventType
import kotlinx.serialization.Serializable
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement

@Serializable
data class Event(
    val socSecNum: String,
    val eventType: EventType,
    val value: JsonElement,
    val sequenceNumber: Long,
    val timestamp: String,
) {
    fun toJson(): String {
        return Json.encodeToString(this).trimIndent()
    }
}
