package com.tietoevry.util

import com.tietoevry.dto.Event
import com.tietoevry.dto.PersonCreatedEvent
import com.tietoevry.types.EventType.*
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonPrimitive

object MockDatabaseUtil {
    fun getEvents(): List<Event> {
        return listOf(
            Event(
                socSecNum = "19056726783",
                eventType = PERSON_CREATED,
                value = PersonCreatedEvent(
                    name = "Ola Nordmann",
                    socSecNum = "19056726783",
                    address = "Tollbugata 11",
                    email = "ola.nordmann@epost.no",
                    phone = "40516390"
                ).toJson(),
                sequenceNumber = 1,
                timestamp = "2024-06-28T08:00:00"
            ),
            Event(
                socSecNum = "31077714505",
                eventType = PERSON_CREATED,
                value = PersonCreatedEvent(
                    name = "Kari Olsen",
                    socSecNum = "31077714505",
                    address = "Arendalsveien 12",
                    email = "kari.olsen@epost.no",
                    phone = "90776220"
                ).toJson(),
                sequenceNumber = 2,
                timestamp = "2024-06-28T08:00:01"
            ),
            Event(
                socSecNum = "25102070758",
                eventType = PERSON_CREATED,
                value = PersonCreatedEvent(
                    name = "Nils Hansen",
                    socSecNum = "25102070758",
                    address = "Hovedgata 45",
                    email = "nils.hansen@epost.no",
                    phone = "90807060"
                ).toJson(),
                sequenceNumber = 3,
                timestamp = "2024-06-28T08:00:02"
            ),
            Event(
                socSecNum = "31085439599",
                eventType = PERSON_CREATED,
                value = PersonCreatedEvent(
                    name = "Per Persson",
                    socSecNum = "31085439599",
                    address = "Fjellveien 1",
                    email = "per.persson@epost.no",
                    phone = "90011223"
                ).toJson(),
                sequenceNumber = 4,
                timestamp = "2024-06-28T08:00:03"
            ),
            Event(
                socSecNum = "03049448170",
                eventType = PERSON_CREATED,
                value = PersonCreatedEvent(
                    name = "Anna Andersson",
                    socSecNum = "03049448170",
                    address = "Sjøgata 3",
                    email = "anna.andersson@epost.no",
                    phone = "91122334"
                ).toJson(),
                sequenceNumber = 5,
                timestamp = "2024-06-28T08:00:04"
            ),
            Event(
                socSecNum = "17084718343",
                eventType = PERSON_CREATED,
                value = PersonCreatedEvent(
                    name = "Lars Larsen",
                    socSecNum = "17084718343",
                    address = "Skogveien 2",
                    email = "lars.larsen@epost.no",
                    phone = "92333445"
                ).toJson(),
                sequenceNumber = 6,
                timestamp = "2024-06-28T08:00:05"
            ),
            Event(
                socSecNum = "01018238361",
                eventType = PERSON_CREATED,
                value = PersonCreatedEvent(
                    name = "Eva Evensen",
                    socSecNum = "01018238361",
                    address = "Enggata 4",
                    email = "eva.evensen@epost.no",
                    phone = "93444556"
                ).toJson(),
                sequenceNumber = 7,
                timestamp = "2024-06-28T08:00:06"
            ),
            Event(
                socSecNum = "04082085608",
                eventType = PERSON_CREATED,
                value = PersonCreatedEvent(
                    name = "Elin Eriksen",
                    socSecNum = "04082085608",
                    address = "Solbakken 10",
                    email = "elin.eriksen@epost.no",
                    phone = "92233445"
                ).toJson(),
                sequenceNumber = 8,
                timestamp = "2024-06-28T08:00:07"
            ),
            Event(
                socSecNum = "05058128041",
                eventType = PERSON_CREATED,
                value = PersonCreatedEvent(
                    name = "Hanne Hansen",
                    socSecNum = "05058128041",
                    address = "Kirkegata 8",
                    email = "hanne.hansen@epost.no",
                    phone = "93344556"
                ).toJson(),
                sequenceNumber = 9,
                timestamp = "2024-06-28T08:00:08"
            ),
            Event(
                socSecNum = "11120673493",
                eventType = PERSON_CREATED,
                value = PersonCreatedEvent(
                    name = "Ivar Iversen",
                    socSecNum = "11120673493",
                    address = "Markveien 15",
                    email = "ivar.iversen@epost.no",
                    phone = "94455667"
                ).toJson(),
                sequenceNumber = 10,
                timestamp = "2024-06-28T08:00:09"
            ),
            Event(
                socSecNum = "13039245072",
                eventType = PERSON_CREATED,
                value = PersonCreatedEvent(
                    name = "Jens Jensen",
                    socSecNum = "13039245072",
                    address = "Dalveien 22",
                    email = "jens.jensen@epost.no",
                    phone = "95566778"
                ).toJson(),
                sequenceNumber = 11,
                timestamp = "2024-06-28T08:00:10"
            ),
            Event(
                socSecNum = "07026404422",
                eventType = PERSON_CREATED,
                value = PersonCreatedEvent(
                    name = "Hanna Hansen",
                    socSecNum = "07026404422",
                    address = "Blomstergata 2",
                    email = "hanna.hansen@epost.no",
                    phone = "94455667"
                ).toJson(),
                sequenceNumber = 12,
                timestamp = "2024-06-28T08:00:11"
            ),
            Event(
                socSecNum = "14027335609",
                eventType = PERSON_CREATED,
                value = PersonCreatedEvent(
                    name = "Kari Karlsen",
                    socSecNum = "14027335609",
                    address = "Rosenkrantz gate 10",
                    email = "kari.karlsen@epost.no",
                    phone = "95566778"
                ).toJson(),
                sequenceNumber = 13,
                timestamp = "2024-06-28T08:00:12"
            ),
            Event(
                socSecNum = "14129113635",
                eventType = PERSON_CREATED,
                value = PersonCreatedEvent(
                    name = "Lise Larsen",
                    socSecNum = "14129113635",
                    address = "Hovedgata 20",
                    email = "lise.larsen@epost.no",
                    phone = "97788990"
                ).toJson(),
                sequenceNumber = 14,
                timestamp = "2024-06-28T08:00:13"
            ),
            Event(
                socSecNum = "23094440017",
                eventType = PERSON_CREATED,
                value = PersonCreatedEvent(
                    name = "Ole Olsen",
                    socSecNum = "23094440017",
                    address = "Fjordveien 9",
                    email = "ole.olsen@epost.no",
                    phone = "98877889"
                ).toJson(),
                sequenceNumber = 15,
                timestamp = "2024-06-28T08:00:14"
            ),
            Event(
                socSecNum = "13016513819",
                eventType = PERSON_CREATED,
                value = PersonCreatedEvent(
                    name = "Lise Nilsen",
                    socSecNum = "13016513819",
                    address = "Parkveien 2",
                    email = "lise.nilsen@epost.no",
                    phone = "99988990"
                ).toJson(),
                sequenceNumber = 16,
                timestamp = "2024-06-28T08:00:15"
            ),
            Event(
                socSecNum = "31124706052",
                eventType = PERSON_CREATED,
                value = PersonCreatedEvent(
                    name = "Emma Eide",
                    socSecNum = "31124706052",
                    address = "Granveien 3",
                    email = "emma.eide@epost.no",
                    phone = "90999000"
                ).toJson(),
                sequenceNumber = 17,
                timestamp = "2024-06-28T08:00:16"
            ),
            Event(
                socSecNum = "19056726783",
                eventType = PHONE_CHANGE,
                value = JsonPrimitive("45536380"),
                sequenceNumber = 18,
                timestamp = "2024-06-28T08:00:17"
            ),
            Event(
                socSecNum = "31077714505",
                eventType = NAME_CHANGE,
                value = JsonPrimitive("Kari Krokstad"),
                sequenceNumber = 19,
                timestamp = "2024-06-28T08:00:18"
            ),
            Event(
                socSecNum = "25102070758",
                eventType = ADDRESS_CHANGE,
                value = JsonPrimitive("Nyveien 45"),
                sequenceNumber = 20,
                timestamp = "2024-06-28T08:00:19"
            ),
            Event(
                socSecNum = "31085439599",
                eventType = EMAIL_CHANGE,
                value = JsonPrimitive("per.newemail@epost.no"),
                sequenceNumber = 21,
                timestamp = "2024-06-28T08:00:20"
            ),
            Event(
                socSecNum = "03049448170",
                eventType = PHONE_CHANGE,
                value = JsonPrimitive("91122345"),
                sequenceNumber = 22,
                timestamp = "2024-06-28T08:00:21"
            ),
            Event(
                socSecNum = "17084718343",
                eventType = NAME_CHANGE,
                value = JsonPrimitive("Lars Larsen-Nygaard"),
                sequenceNumber = 23,
                timestamp = "2024-06-28T08:00:22"
            ),
            Event(
                socSecNum = "01018238361",
                eventType = ADDRESS_CHANGE,
                value = JsonPrimitive("Enggata 5"),
                sequenceNumber = 24,
                timestamp = "2024-06-28T08:00:23"
            ),
            Event(
                socSecNum = "04082085608",
                eventType = EMAIL_CHANGE,
                value = JsonPrimitive("elin.eriksen@nyepost.no"),
                sequenceNumber = 25,
                timestamp = "2024-06-28T08:00:24"
            ),
            Event(
                socSecNum = "05058128041",
                eventType = PHONE_CHANGE,
                value = JsonPrimitive("92255667"),
                sequenceNumber = 26,
                timestamp = "2024-06-28T08:00:25"
            ),
            Event(
                socSecNum = "11120673493",
                eventType = NAME_CHANGE,
                value = JsonPrimitive("Ivar Iversen-Hansen"),
                sequenceNumber = 27,
                timestamp = "2024-06-28T08:00:26"
            ),
            Event(
                socSecNum = "13039245072",
                eventType = ADDRESS_CHANGE,
                value = JsonPrimitive("Ny adresse 67"),
                sequenceNumber = 28,
                timestamp = "2024-06-28T08:00:27"
            ),
            Event(
                socSecNum = "07026404422",
                eventType = EMAIL_CHANGE,
                value = JsonPrimitive("hanna.hansen@nyepost.no"),
                sequenceNumber = 29,
                timestamp = "2024-06-28T08:00:28"
            ),
            Event(
                socSecNum = "14027335609",
                eventType = PHONE_CHANGE,
                value = JsonPrimitive("94455678"),
                sequenceNumber = 30,
                timestamp = "2024-06-28T08:00:29"
            ),
            Event(
                socSecNum = "14129113635",
                eventType = ADDRESS_CHANGE,
                value = JsonPrimitive("Hovedgata 21"),
                sequenceNumber = 31,
                timestamp = "2024-06-28T08:00:30"
            ),
            Event(
                socSecNum = "23094440017",
                eventType = NAME_CHANGE,
                value = JsonPrimitive("Ole Olsen-Berg"),
                sequenceNumber = 32,
                timestamp = "2024-06-28T08:00:31"
            ),
            Event(
                socSecNum = "13016513819",
                eventType = EMAIL_CHANGE,
                value = JsonPrimitive("lise.nilsen@nyepost.no"),
                sequenceNumber = 33,
                timestamp = "2024-06-28T08:00:32"
            ),
            Event(
                socSecNum = "31124706052",
                eventType = PHONE_CHANGE,
                value = JsonPrimitive("90999011"),
                sequenceNumber = 34,
                timestamp = "2024-06-28T08:00:33"
            )
        )
    }
}