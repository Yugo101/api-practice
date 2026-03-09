# Task Management API (Spring Boot)

## Overview

Task Management API is a RESTful backend application built with **Spring Boot**.
It provides basic **CRUD operations for task management**, allowing users to create, read, update, and delete tasks.

This project was developed to practice **REST API design, Spring Boot architecture, and database integration**.

---

## Tech Stack

* Java 21
* Spring Boot 3
* Spring Data JPA
* MySQL
* Gradle
* Swagger (OpenAPI)
* Spring Security
* JWT Authentication

---

## Features

* Create a task
* Get all tasks (pagination supported)
* Get task by ID
* Update task
* Delete task
* JWT-based authentication
* API request/response logging
* Swagger API documentation

---

## API Endpoints

| Method | Endpoint    | Description    |
| ------ | ----------- | -------------- |
| GET    | /tasks      | Get task list  |
| GET    | /tasks/{id} | Get task by id |
| POST   | /tasks      | Create task    |
| PUT    | /tasks/{id} | Update task    |
| DELETE | /tasks/{id} | Delete task    |

---

## Example Request

### Create Task

POST /tasks

```
{
  "title": "Study Spring Boot",
  "description": "Build REST API"
}
```

### Response

```
{
  "id": 1,
  "title": "Study Spring Boot",
  "description": "Build REST API",
  "completed": false
}
```

---

## Database Schema

```
task
 ├─ id (BIGINT, PK)
 ├─ title (VARCHAR)
 ├─ description (VARCHAR)
 └─ completed (BOOLEAN)
```

---

## API Documentation

Swagger UI is available at:

```
http://localhost:8080/swagger-ui/index.html
```

---

## Run Locally

### Clone repository

```
git clone https://github.com/yourusername/task-api.git
```

### Move to project

```
cd task-api
```

### Run application

```
./gradlew bootRun
```

---

## Author

GitHub
https://github.com/yourusername

---

## Purpose

This project was built to practice:

* REST API development
* Spring Boot architecture
* Database integration
* API documentation
* Backend engineering skills
