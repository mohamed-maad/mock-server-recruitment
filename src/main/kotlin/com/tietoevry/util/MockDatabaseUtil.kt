package com.tietoevry.util

import com.tietoevry.dto.Event
import com.tietoevry.dto.Person
import com.tietoevry.dto.PersonChange
import com.tietoevry.dto.PersonCreatedEvent
import com.tietoevry.types.EventType.*
import kotlinx.serialization.json.JsonPrimitive

object MockDatabaseUtil {
    fun getEventList(): List<Event> {
        val events1 = listOf(
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
                socSecNum = "19056726783",
                eventType = NAME_CHANGE,
                value = JsonPrimitive("Ola Hansen"),
                sequenceNumber = 2,
                timestamp = "2024-06-28T08:10:00"
            ),
            Event(
                socSecNum = "19056726783",
                eventType = ADDRESS_CHANGE,
                value = JsonPrimitive("Nyveien 12"),
                sequenceNumber = 3,
                timestamp = "2024-06-28T08:20:00"
            ),
            Event(
                socSecNum = "19056726783",
                eventType = EMAIL_CHANGE,
                value = JsonPrimitive("ola.hansen@nyepost.no"),
                sequenceNumber = 4,
                timestamp = "2024-06-28T08:30:00"
            )
        )

        val events2 = listOf(
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
                socSecNum = "31077714505",
                eventType = NAME_CHANGE,
                value = JsonPrimitive("Kari Johansen"),
                sequenceNumber = 3,
                timestamp = "2024-06-28T08:10:00"
            ),
            Event(
                socSecNum = "31077714505",
                eventType = ADDRESS_CHANGE,
                value = JsonPrimitive("Blomsterveien 34"),
                sequenceNumber = 4,
                timestamp = "2024-06-28T08:20:00"
            ),
            Event(
                socSecNum = "31077714505",
                eventType = EMAIL_CHANGE,
                value = JsonPrimitive("kari.johansen@nyepost.no"),
                sequenceNumber = 5,
                timestamp = "2024-06-28T08:30:00"
            )
        )

        val events3 = listOf(
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
                socSecNum = "25102070758",
                eventType = NAME_CHANGE,
                value = JsonPrimitive("Nils Johansen"),
                sequenceNumber = 4,
                timestamp = "2024-06-28T08:10:00"
            ),
            Event(
                socSecNum = "25102070758",
                eventType = ADDRESS_CHANGE,
                value = JsonPrimitive("Skogveien 10"),
                sequenceNumber = 5,
                timestamp = "2024-06-28T08:20:00"
            ),
            Event(
                socSecNum = "25102070758",
                eventType = EMAIL_CHANGE,
                value = JsonPrimitive("nils.johansen@nyepost.no"),
                sequenceNumber = 6,
                timestamp = "2024-06-28T08:30:00"
            )
        )


        val events4 = listOf(
            Event(
                socSecNum = "51088439599",
                eventType = PERSON_CREATED,
                value = PersonCreatedEvent(
                    name = "Per Persson",
                    socSecNum = "31085439599",
                    address = "Fjellveien 1",
                    email = "per.persson@epost.no",
                    phone = "95011223"
                ).toJson(),
                sequenceNumber = 4,
                timestamp = "2024-06-28T08:00:03"
            ),
            Event(
                socSecNum = "51088439599",
                eventType = SOCSECNUM_CHANGE,
                value = JsonPrimitive("11088439599"),
                sequenceNumber = 5,
                timestamp = "2024-06-28T08:10:00"
            ),
            Event(
                socSecNum = "11088439599",
                eventType = PHONE_CHANGE,
                value = JsonPrimitive("90112233"),
                sequenceNumber = 6,
                timestamp = "2024-06-28T08:20:00"
            ),
            Event(
                socSecNum = "11088439599",
                eventType = ADDRESS_CHANGE,
                value = JsonPrimitive("Fjelltoppen 11"),
                sequenceNumber = 7,
                timestamp = "2024-06-28T08:20:50"
            )
        )


        val events5 = listOf(
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
                socSecNum = "03049448170",
                eventType = ADDRESS_CHANGE,
                value = JsonPrimitive("Havnegata 5"),
                sequenceNumber = 6,
                timestamp = "2024-06-28T08:10:00"
            ),
            Event(
                socSecNum = "03049448170",
                eventType = EMAIL_CHANGE,
                value = JsonPrimitive("anna.andersson@nyepost.no"),
                sequenceNumber = 7,
                timestamp = "2024-06-28T08:20:00"
            ),
            Event(
                socSecNum = "03049448170",
                eventType = PHONE_CHANGE,
                value = JsonPrimitive("92233445"),
                sequenceNumber = 8,
                timestamp = "2024-06-28T08:30:00"
            )
        )


        val events6 = listOf(
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
                socSecNum = "04082085608",
                eventType = NAME_CHANGE,
                value = JsonPrimitive("Elin Hansen"),
                sequenceNumber = 9,
                timestamp = "2024-06-28T08:10:00"
            ),
            Event(
                socSecNum = "04082085608",
                eventType = PHONE_CHANGE,
                value = JsonPrimitive("93344556"),
                sequenceNumber = 10,
                timestamp = "2024-06-28T08:20:00"
            ),
            Event(
                socSecNum = "04082085608",
                eventType = ADDRESS_CHANGE,
                value = JsonPrimitive("Nyveien 15"),
                sequenceNumber = 11,
                timestamp = "2024-06-28T08:30:00"
            )
        )


        val events7 = listOf(
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
                socSecNum = "11120673493",
                eventType = NAME_CHANGE,
                value = JsonPrimitive("Ivar Hansen"),
                sequenceNumber = 11,
                timestamp = "2024-06-28T08:10:00"
            ),
            Event(
                socSecNum = "11120673493",
                eventType = ADDRESS_CHANGE,
                value = JsonPrimitive("Bakkegata 20"),
                sequenceNumber = 12,
                timestamp = "2024-06-28T08:20:00"
            ),
            Event(
                socSecNum = "11120673493",
                eventType = EMAIL_CHANGE,
                value = JsonPrimitive("ivar.hansen@nyepost.no"),
                sequenceNumber = 13,
                timestamp = "2024-06-28T08:30:00"
            ),
            Event(
                socSecNum = "11120673493",
                eventType = SOCSECNUM_CHANGE,
                value = JsonPrimitive("12120673493"),
                sequenceNumber = 14,
                timestamp = "2024-06-28T08:40:00"
            )
        )

        return events1 + events2 + events3 + events4 + events5 + events6 + events7
    }

    fun getPeopleChangeList(): List<PersonChange> {
        val person1 = PersonChange(
            Person("Ola Nordmann", "19056726783", "Tollbugata 11", "ola.nordmann@epost.no", "40516390"),
            Person("Ola Hansen", "19056726783", "Nyveien 12", "ola.nordmann@epost.no", "40516390")
        )

        val person2 = PersonChange(
            Person("Kari Olsen", "31077714505", "Arendalsveien 12", "kari.olsen@epost.no", "90776220"),
            Person("Kari Johansen", "31077714505", "Blomsterveien 34", "kari.johansen@nyepost.no", "90776220")
        )

        val person3 = PersonChange(
            Person("Nils Hansen", "25102070758", "Hovedgata 45", "nils.hansen@epost.no", "90807060"),
            Person("Nils Johansen", "25102070758", "Skogveien 10", "nils.johansen@nyepost.no", "90807060")
        )

        val person4 = PersonChange(
            Person("Per Persson", "31085439599", "Fjellveien 1", "per.persson@epost.no", "90011223"),
            Person("Per Persson", "32085439599", "Fjelltoppen 11", "per.persson@epost.no", "90112233")
        )

        val person5 = PersonChange(
            Person("Anna Andersson", "03049448170", "Sjøgata 3", "anna.andersson@epost.no", "91122334"),
            Person("Anna Andersson", "03049448170", "Havnegata 5", "anna.andersson@nyepost.no", "92233445")
        )

        val person6 = PersonChange(
            Person("Elin Eriksen", "04082085608", "Solbakken 10", "elin.eriksen@epost.no", "92233445"),
            Person("Elin Hansen", "04082085608", "Nyveien 15", "elin.eriksen@epost.no", "93344556")
        )

        val person7 = PersonChange(
            Person("Ivar Iversen", "11120673493", "Markveien 15", "ivar.iversen@epost.no", "94455667"),
            Person("Ivar Hansen", "12120673493", "Bakkegata 20", "ivar.hansen@nyepost.no", "94455667")
        )

        return listOf(person1, person2, person3, person4, person5, person6, person7)
    }
}