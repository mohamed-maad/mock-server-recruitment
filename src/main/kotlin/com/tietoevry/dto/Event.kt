package com.tietoevry.dto

import com.tietoevry.types.EventType
import kotlinx.serialization.Serializable
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json

@Serializable
data class Event(
    val eventType: EventType,
    val value: String,
    val sequenceNumber: Long,
    val timestamp: String,
) {
    fun toJson(): String {
        return Json.encodeToString(this)
    }
}
