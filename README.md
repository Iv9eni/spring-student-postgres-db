### Description

Simple RESTful application created with **Java** & **Spring**  using Apache Tomcat. This application can be treated as a microservice using PostgreSql to host a database storing a list of students.

### Features
- Add, delete, modify people entries.
- Retrieve list of people.

### Instructions

`GET localhost:8080/api/v1/student`
- Retrieves all people.

`GET localhost:8080/api/v1/student/{id}`
- Retrieves single student entry with specified id.

`POST localhost:8080/api/v1/student`
```json
{
    "name": "John Doe",
    "email": "",
    "dob": "2022-09-10"
}
```
- Creates a student entry and adds them to the database generating a unique Id with the name specified in the JSON body above and email if the email is not taken.

`PUT localhost:8080/api/v1/student/{id}`
```json
{
    "name": "John Doe",
    "email": "johndoe@gmail.com"
}
```
- Modifies the student name with {id} to the name "John Doe" if they exist and changes their email as well if it is not taken. One of two or two keys are required for this PUT request.


`DELETE localhost:8080/api/v1/student/{id}`

- Deletes student with specified id.
