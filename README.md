# Mock Server for Recruitment

## OPPGAVETEKSTEN ER IKKE FERDIG

Application for testing the skills of applying developers

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



