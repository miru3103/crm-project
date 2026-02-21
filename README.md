CRM Management System

A simple Customer Relationship Management (CRM) REST API built using Spring Boot and MySQL.
This project demonstrates CRUD operations using Spring Data JPA and Hibernate.



🛠 Technologies Used

* Java 17 / 23
* Spring Boot 4
* Spring Data JPA
* Hibernate
* MySQL 8
* Maven
* Apache Tomcat (Embedded)

 📌 Features

* Add a new customer
* View all customers
* View customer by ID
* Delete a customer
* RESTful API structure
* MySQL database integration

 🗂 Project Structure


src/
 ├── main/
 │   ├── java/com/mrunalini/crm/
 │   │    ├── controller/
 │   │    ├── service/
 │   │    ├── repository/
 │   │    ├── model/
 │   │    └── CrmApplication.java
 │   └── resources/
 │        └── application.properties
 └── test/

⚙️ Database Configuration

Make sure MySQL is running.

Create database:

sql
CREATE DATABASE crm_db;


Update application.properties:

spring.datasource.url=jdbc:mysql://localhost:3306/crm_db
spring.datasource.username=root
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true




 ▶️ How to Run the Project

 Using Maven:


mvn clean install
mvn spring-boot:run


OR run CrmApplication.java directly from your IDE.

Application will start on:

http://localhost:8082

 🔗 API Endpoints

### Get All Customers

GET /customers


 ### Get Customer By ID


GET /customers/{id}


### Add Customer


POST /customers


Example JSON:

json
{
  "name": "John Doe",
  "email": "john@example.com",
  "phone": "9876543210"
}


### Delete Customer


DELETE /customers/{id}


📷 Sample Output

When running successfully, you will see:

* Spring Boot banner
* Tomcat started on port 8082
* MySQL connection established
* Hibernate SQL logs



### Author

Mrunalini S
GitHub: [https://github.com/miru3103](https://github.com/miru3103)



# 🎯 Project Purpose

This project was built to demonstrate:

* Backend development using Spring Boot
* REST API creation
* Database integration with MySQL
* Maven project management
* Git & GitHub version control


