Stock Management System (Spring Boot)

A simple backend REST API built with Spring Boot to manage stock items.
This project is being developed incrementally to practice real-world backend development concepts.

--------------------------------------------------

FEATURES (SO FAR)

- Create stock items
- Retrieve all stock items
- Retrieve a stock item by ID
- Update stock items
- Delete stock items
- Input validation using Bean Validation
- In-memory database (H2)
- RESTful API design

--------------------------------------------------

TECH STACK

- Java 17
- Spring Boot
- Spring Web
- Spring Data JPA
- Bean Validation
- H2 Database
- Maven

--------------------------------------------------

PROJECT STRUCTURE

src/main/java/com/stockproject/stockmanagementsystem

controller        -> REST controllers
model             -> JPA entities
repository        -> Spring Data repositories
dto               -> Data Transfer Objects (requests/responses)
exception         -> Custom exceptions
StockManagementSystemApplication.java

--------------------------------------------------

API ENDPOINTS

POST   /api/items          -> Create item
GET    /api/items          -> Get all items
GET    /api/items/{id}     -> Get item by ID
PUT    /api/items/{id}     -> Update item
DELETE /api/items/{id}     -> Delete item

--------------------------------------------------

TESTING THE API

Requests can be tested using:
- IntelliJ HTTP Client (.http files)
- Postman
- curl

Example request:

POST http://localhost:8080/api/items
Content-Type: application/json

{
  "name": "Keyboard",
  "quantity": 10,
  "price": 49.99
}

--------------------------------------------------

DATABASE

- Uses H2 (in-memory) for development
- Data resets when the application restarts

--------------------------------------------------

PROJECT GOALS

This project is built step by step to learn:
- REST API design
- Persistence with JPA
- Validation
- Proper project structure
- Git and GitHub workflow

Future plans:
- DTO separation (request/response)
- Global exception handling
- PostgreSQL integration
- Security (Spring Security)
- Basic frontend

--------------------------------------------------

NOTES

This is a learning-focused project and will evolve over time.
Each commit represents a meaningful development step.

--------------------------------------------------

AUTHOR

Built by Salvador Mota Fragoso
