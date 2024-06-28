package com.tietoevry.service

import com.tietoevry.dto.Event
import com.tietoevry.util.MockDatabaseUtil
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class DataService {
    fun eventFlow(): Flow<Event> {
        val eventList = MockDatabaseUtil.getEventList()

        return flow {
            eventList.forEach {
                emit(it)
                delay(DELAY_MILLIS)
            }
        }
    }

    fun eventFlowFromSequenceNumber(sequenceNumber: Long): Flow<Event>? {
        val eventList = MockDatabaseUtil.getEventList()

        if (sequenceNumber > eventList.last().sequenceNumber) return null

        return flow {
            eventList
                .filter { it.sequenceNumber >= sequenceNumber}
                .forEach {
                emit(it)
                delay(DELAY_MILLIS)
            }
        }
    }

    fun getEvent(sequenceNumber: Long): Event? {
        return MockDatabaseUtil.getEventList().find { it.sequenceNumber == sequenceNumber }
    }

    companion object {
        const val DELAY_MILLIS = 10L
    }
}