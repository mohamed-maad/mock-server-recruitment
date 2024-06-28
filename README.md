# Mock Server DS

## OPPGAVETEKSTEN ER IKKE FERDIG

This is an application for testing the skills of developers applying for *Java Backend Developer* positions.

## What you will need

1) Dev environment with Java 21
2) PostgreSQL database 14 or newer
3) Clone the skeleton repository: https://github.com/mohamed-maad/server-skeleton-recruitment-junior

## Requirements for the application

1) Written in Java or Kotlin
2) Use Spring or Quarkus framework
3) Communicate with PostgreSQL database

## System description

This application is a mock server which mimics the behaviour of Folkeregisteret and how Skatteetaten handles
data distribution about people through feed. All information about a person starts by an event which signals
that the person har been created, followed by different events which signal that an attributes of the person has
been updated. 

A person has the following format:

```Json
{
  "name": "Per Persson",
  "socSecNum": "31085439599",
  "address": "Fjellveien 1",
  "email": "per.persson@epost.no",
  "phone": "95011223"
}
```

The events are stored in a "database" and can be fetched by a client, either by fetching all events,
fetching events from a specific sequence number or fetching a specific event by its sequence number.

An event has the following format:

```Json
{
  "socSecNum": "51088439599",
  "eventType": "SOCSECNUM_CHANGE",
  "value": "11088439599",
  "sequenceNumber": 14,
  "timestamp": "2024-06-28T08:00:13"
}
```





### 1) Get token:

Use the following credentials:

```
username: Skjervald
password: Tvedt
```

### 2) Use token to fetch data about people:

```
GET /events
GET /events/from/{sequenceNumber}
GET /events/{sequenceNumber}
```

### 3) Save people and events to database:

```
POST /events
```

### 4) Create endpoint for fetching data from database:

```
GET /person/{socialSecurityNumber}
```

### 5) Run tests:

```
GET /test/1
GET /test/2
GET /test/3
```



