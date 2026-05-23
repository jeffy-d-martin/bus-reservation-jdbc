# Bus Reservation System (JDBC Practice)

A core Java command-line application built to explore relational database connectivity, SQL operations, and transaction management using JDBC and MySQL. 

This project serves as a foundational step in my journey toward becoming a Java Spring Boot Developer, helping me master database interactions before transitioning to automated frameworks like Hibernate and Spring Data JPA.

## 🚀 Features
* **View Available Buses:** Retrieves real-time schedule, route, and capacity data from a MySQL instance using SQL `SELECT` statements.
* **Seat Booking:** Updates bus capacity using parameterized SQL queries to prevent SQL injection vulnerabilities.
* **Transaction Safety:** Implements manual commit and rollback mechanisms (`setAutoCommit(false)`) to maintain database integrity during updates.

## 🛠️ Tech Stack & Concepts Covered
* **Language:** Java
* **Database:** MySQL
* **API:** Java Database Connectivity (JDBC)
* **Core Concepts:** PreparedStatements, ResultSets, Resource Management (Try-with-Resources), and Environment Variables for secure credential storage.

## 🔑 How to Setup Environment Variables
To keep database credentials secure, this application reads them from your local environment setup. Set the following variables on your machine before running:
* `DB_URL`: Your database connection string (e.g., `jdbc:mysql://localhost:3306/your_db`)
* `DB_USER`: Your database username
* `DB_PASSWORD`: Your database password
