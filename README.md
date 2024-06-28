# Mock Server DS

### Please send an email if something is not working as expected.

This is an application for testing the skills of developers applying for *Java Backend Developer* positions.

### Tips

Use your favourite http client (curl, Postman, Insomnia) to test the endpoints of this server. Looking at the
response will help you understand how to handle the data.

## What you will need

1) Dev environment with Java 21
2) PostgreSQL database 14 or newer
3) Clone the skeleton repository: https://github.com/mohamed-maad/server-skeleton-recruitment-junior

## Requirements for the task

1) Written in Java or Kotlin
2) Use Spring or Quarkus framework
3) Communicate with PostgreSQL database

## System description

This application is a mock server which mimics the behaviour of Folkeregisteret and how Skatteetaten handles
data distribution about people through feed. All information about a person starts by an event which signals
that the person har been created, followed by different events which signal that an attribute of the person has
been updated. 

A `Person` has the following format:

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
All events have a unique sequence number, and all sequences are in order.

An `Event` has the following format:

```Json
{
  "socSecNum": "51088439599",
  "eventType": "SOCSECNUM_CHANGE",
  "value": "11088439599",
  "sequenceNumber": 14,
  "timestamp": "2024-06-28T08:00:13"
}
```

Every attribute of a person can be updated, even the social security number. When the social security number is updated,
the field `socSecNum` points to the old social security number, and the field `value` points to the new social security number.

When a person is created, the event type is `PERSON_CREATED`, and a `Person` Json is set as the value of the `Event`.

## The task

0) Clone the skeleton repository: https://github.com/mohamed-maad/server-skeleton-recruitment-junior 
1) Create a REST client which gets the Jwt token from the server. Use username and password

Use JWT token to fetch events from the server.

2) Create a REST client which fetches events from the server. 
3) Save the events to a table using DAOs.
4) Use the same events to create a table with people, and update their information.
5) Create a REST controller which allows for a client to fetch a person by its social security number. The person
should be updated with all events which have happened to the person.
6) Run tests using the test endpoints on this mock server. A client on this mock server will try to connect and 
fetch data from your person endpoint. The tests will check if your application is working as expected.
7) Send a pull request to the skeleton repository with your solution.

### 0) Setup:

Ensure that your application is responding on the following url: http://localhost:8081

### 1) Get token:

```
GET http://localhost:8080/token
Content-Type: application/x-www-form-urlencoded
```

Use the following credentials:

```
username: Donald
password: Fantonald
```

### 2) Use token to fetch events:

```
GET http://localhost:8080/events
Authorization: Bearer {{mock_server_token}}
```

Other endpoints:

```
GET http://localhost:8080/events/23
GET http://localhost:8080/events/from/13
```

### 3) Save events to database:

Use a DAO

### 4) Save people to database and update their information:

Use a DAO

### 5) Create person controller:

The endpoint should respond to at the following url: http://localhost:8081/person/{socSecNum}

The client of this mock server sends the following headers, which is the one your endpoint is responding to:

```
Authorization: Dummy.Token.For.Your.Convenience
Accept: application/json
```

The client expects a `Person` in return.

### 6) Run tests:

These don't need authentication. You can trigger them through curl, Postman or Insomnia, or from your program if you want.

```
GET http://localhost:8080/test/1
GET http://localhost:8080/test/2
GET http://localhost:8080/test/3
```

### 7) Send a pull request:

Send a pull request to the skeleton repository with your solution at: 
https://github.com/mohamed-maad/server-skeleton-recruitment-junior


