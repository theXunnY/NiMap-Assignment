
# Spring Boot CRUD API for Categories and Products

This is a Spring Boot application that provides a **CRUD (Create, Read, Update, Delete)** API for managing **Categories** and **Products**. The application uses **Spring Data JPA** for database interaction and **MySQL** as the backend database. This API allows users to manage categories and products, where each product is associated with a specific category.

## Features

- **Category CRUD operations**: Create, Read, Update, and Delete categories.
- **Product CRUD operations**: Create, Read, Update, and Delete products.
- **Pagination**: Support for paginated results for both categories and products.
- **Relationships**: Categories are linked to products  , with a one-to-many relationship.

## Tech Stack

- **Backend Framework**: Spring Boot
- **Database**: Postgres (can be configured for other databases)
- **ORM**: Spring Data JPA/Hibernate
- **Build Tool**: Maven
---

## Getting Started

### Prerequisites

Before running the application, make sure you have the following installed:

1. **Java 17 or higher**
2. **Maven**
3. **Postgres** (or any compatible database)
4. **API Testion Tool**: Postman or any


### Database Configuration (application.properties)

Before running the application, make sure you have the following installed:

1. **Java 17 or higher**
2. **Maven**
3. **MySQL** (or any compatible database)


### Clone the Repository

To get started, clone this repository to your local machine:

```bash
git clone https://github.com/your-username/spring-boot-crud-api.git
cd spring-boot-crud-api

```

### Database Configuration (application.properties)

Configure your MySQL database in the application.properties file:

```bash
spring.datasource.url=jdbc:mysql://localhost:3306/testdb
spring.datasource.username=root
spring.datasource.password=password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

```

# Running the Application
1. Make sure you have Postgres(other need to Configure) installed and running.
2. Create a new database called testdb or modify the application.properties with your 
3. database credentials.
4. Run the application using Maven or your IDE of choice.


# API Endpoints Documentation

## 1. Categories Endpoints

### `GET /api/categories?page=0&size=5`

Retrieve a paginated list of all categories.

**Query Parameters:**
- `page` (optional, default: `0`): Page number to retrieve.
- `size` (optional, default: `5`): Number of categories per page.

**Response:**
- A list of categories with pagination information (total pages, current page, etc.).


### `GET /api/categories?page=0:` Get paginated list of categories(default page is set to 0 and default  data size is 4).
### `GET /api/categories/{id}:` Get a category by its ID.
### `POST /api/categories`: Create a new category
### `PUT /api/categories/{id}` : Update an existing category.
### `DELETE /api/categories/{id}` : Delete a category.


## 2. products Endpoints
### `GET /api/products?page=0` : Get paginated list of products(default page is set to 0 and default  data size is 4).
### `GET /api/products/{id} ` : Get a product by its ID.
### `POST /api/products ` : Create a new product.
### `PUT /api/products/{id} `: Update an existing product.
### `DELETE /api/products/{id} `: Delete a product.

# Some Screenshots
![Screenshot 2024-12-20 005944](https://github.com/user-attachments/assets/b7747fde-779f-4d94-b51c-5d10d81ab29d)
![Screenshot 2024-12-20 005848](https://github.com/user-attachments/assets/c9685204-3efa-41dd-8d7e-161cc5ff161e)
![Screenshot 2024-12-20 010432](https://github.com/user-attachments/assets/17fce0d7-e0ad-41ea-9b99-cd618472c6ff)
![Screenshot 2024-12-20 010415](https://github.com/user-attachments/assets/cd298ee6-c80d-48c3-8f93-7b0b0ea903fe)
![Screenshot 2024-12-20 010346](https://github.com/user-attachments/assets/2aa48c66-1e54-433c-b3fc-969e1c26915f)
![Screenshot 2024-12-20 010243](https://github.com/user-attachments/assets/0bf8a3cb-0f9f-48de-88c2-5ab9852a978a)
![Screenshot 2024-12-20 010119](https://github.com/user-attachments/assets/f25a29d4-31f0-4224-9b1a-5fb13afb3c4f)
![Screenshot 2024-12-20 010025](https://github.com/user-attachments/assets/1ceef27d-526c-4871-9c3b-e97131a44dff)


