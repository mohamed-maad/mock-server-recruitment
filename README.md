# Mock Server DS

### It is **not expected** that all tasks are completed, depending on the experience level of the applicant.

If juniors complete 2-4 tasks, it is considered adequate. The more you solve the better.
Seniors should complete all the tasks.

### Please send an email if something is not working as expected.

This is an application for testing the skills of developers applying for *Java/Kotlin Backend Developer* positions.

### Tips

- Use your favourite http client (curl, Postman, Insomnia) to test the endpoints of this server. Looking at the
response will help you understand how to handle the data.

- If saving to a database is too difficult, you can instead save the data in runtime memory as a `List<Person>` and `List<Event>`.

- Google is your friend.
- Search for `Concept + Baeldung`. Example: `Spring REST client Baeldung`.

## What you will need

1) Dev environment with Java 21
2) PostgreSQL 14 or newer

## Requirements for the task

1) Written in Java or Kotlin
2) Use Spring or Quarkus framework
3) Communicate with PostgreSQL database
4) *Optional:* Clone the skeleton repository *(Kotlin or Java)*: 
- https://github.com/mohamed-maad/server-skeleton-recruitment
- https://github.com/mohamed-maad/server-skeleton-java

## System description

This application is a mock server which mimics the behaviour of Folkeregisteret and how Skatteetaten handles
data distribution about people through an event feed. All information about a person starts by an event which signals
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

#### Summary:

1) Setup submission repository. *Optional:* Clone the skeleton repository *(Kotlin or Java)*: 

- https://github.com/mohamed-maad/server-skeleton-recruitment 
- https://github.com/mohamed-maad/server-skeleton-java 

2) Create a REST client which gets the Jwt token from the server. Use username and password

Use JWT token to fetch events from the server.

3) Create a REST client which fetches events from the server. 
4) Save the events to a table.
5) Use the same events to create a table with people, and update their information.
6) Create a REST controller which allows for a client to fetch a person by its social security number. The person
should be updated with all events which have happened to the person.
7) Run tests using the test endpoints on this mock server. A client on this mock server will try to connect and 
fetch data from your person endpoint. The tests will check if your application is working as expected.


### 1) Setup:

- Clone and run this mock server application. You can use: `./gradlew run`
- *Optional:* Clone the skeleton repository
- Create your own repository and push code to it
- Ensure that your application is responding on the following url: http://localhost:8081

### 2) Get token:

```
POST http://localhost:8080/token
Content-Type: application/x-www-form-urlencoded
```

Use the following credentials:

```
username: Donald
password: Fantonald
```

**The token is valid for 5 minutes.**

### 3) Use token to fetch events:

This endpoint uses SSE. It sends events to the client as they happen.

```
GET http://localhost:8080/events
Authorization: Bearer {{mock_server_token}}
```

This endpoint fetches events from a specific sequence number:

```
GET http://localhost:8080/events/from/13
Authorization: Bearer {{mock_server_token}}
```

You can use this endpoint to fetch a specific event by sequence number:

```
GET http://localhost:8080/events/23
Authorization: Bearer {{mock_server_token}}
```

### 4) Save events to database:

Save to a table in your database

### 5) Save people to database and update their information:

Save to a table in your database

### 6) Create person controller:

The endpoint should respond at the following url: `GET` http://localhost:8081/person/{socSecNum}

The client of this mock server sends the following headers, which is the one your endpoint is responding to:

```
Authorization: Dummy.Token.For.Your.Convenience
Accept: application/json
```

The client expects a `Person` in return.

### 7) Run tests:

These don't need authentication. You can trigger them through curl, Postman or Insomnia, or from your program if you want.

```
GET http://localhost:8080/test/1
GET http://localhost:8080/test/2
GET http://localhost:8080/test/3
```

## Submission

Please send a link of your repository to your contact person.


