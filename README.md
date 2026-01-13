# Stock Management System (Spring Boot)

A backend REST API built with **Spring Boot** to manage stock items.
This project is developed incrementally to practice real-world backend development concepts.

---

## 🚀 Features

- Create stock items
- Retrieve all stock items
- Retrieve a stock item by ID
- Update stock items
- Delete stock items
- Input validation using Bean Validation
- In-memory database (H2)
- RESTful API design

---

## 🛠 Tech Stack

- Java 17
- Spring Boot
- Spring Web
- Spring Data JPA
- Bean Validation
- H2 Database
- Maven

---

## 📁 Project Structure

- **controller** → REST controllers  
- **model** → JPA entities  
- **repository** → Spring Data repositories  
- **dto** → Data Transfer Objects (requests / responses)  
- **exception** → Custom exceptions  
- **StockManagementSystemApplication.java** → Application entry point  

---

## 🔗 API Endpoints

- **POST** `/api/items` → Create item  
- **GET** `/api/items` → Get all items  
- **GET** `/api/items/{id}` → Get item by ID  
- **PUT** `/api/items/{id}` → Update item  
- **DELETE** `/api/items/{id}` → Delete item  

---

## 🧪 Testing the API

Requests can be tested using:

- IntelliJ HTTP Client (`.http` files)
- Postman
- curl

### Example request

```http
POST http://localhost:8080/api/items
Content-Type: application/json

{
  "name": "Keyboard",
  "quantity": 10,
  "price": 49.99
}


