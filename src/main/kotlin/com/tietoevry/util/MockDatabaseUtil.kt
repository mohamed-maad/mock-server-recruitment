package com.tietoevry.util

import com.tietoevry.dto.Event
import com.tietoevry.types.EventType.*

object MockDatabaseUtil {
    fun getEvents(): List<Event> {
        return listOf(
            Event(
                eventType = PERSON_CREATED,
                value = "First event",
                sequenceNumber = 1,
                timestamp = "2021-01-01T00:00:00"
            ),
            Event(
                eventType = "UPDATE",
                value = "Second event",
                sequenceNumber = 2,
                timestamp = "2021-01-01T00:00:01"
            ),
            Event(
                eventType = "DELETE",
                value = "Third event",
                sequenceNumber = 3,
                timestamp = "2021-01-01T00:00:02"
            )
    }
}