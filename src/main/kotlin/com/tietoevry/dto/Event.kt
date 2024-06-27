package com.tietoevry.dto

import com.tietoevry.types.EventType
import kotlinx.serialization.Serializable

@Serializable
data class Event(
    val socSecNum: String,
    val eventType: EventType,
    val value: String,
    val sequenceNumber: Long,
    val timestamp: String,
)
