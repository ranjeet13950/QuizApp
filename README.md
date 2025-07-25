# Quiz App 🧠🎯

A simple and powerful **Quiz Application** built using **Spring Boot**, **MySQL**, and **REST APIs**. This project helps manage and retrieve quiz questions categorized by difficulty and technology such as Java and Python.

## 🚀 Features

- Add, update, delete quiz questions
- Get all quiz questions via REST API
- Filter questions by:
  - Category (e.g., Java, Python)
  - Difficulty level (Easy, Medium, Hard)
- JSON API response for frontend integration
- MySQL database support

---

## 🛠️ Technologies Used

- Java 23
- Spring Boot 3.5.3
- Spring Data JPA
- MySQL 8
- Maven
- Lombok
- IntelliJ IDEA

---

## 🗃️ Database Schema (MySQL)

```sql
CREATE TABLE Question (
  id INT PRIMARY KEY AUTO_INCREMENT,
  question_title TEXT NOT NULL,
  option1 TEXT NOT NULL,
  option2 TEXT NOT NULL,
  option3 TEXT NOT NULL,
  option4 TEXT NOT NULL,
  right_answer TEXT NOT NULL,
  difficulty_level TEXT NOT NULL,
  category TEXT NOT NULL
);

💡 Getting Started
Prerequisites
Java 17+ or Java 23
MySQL installed and running
IntelliJ IDEA / Eclipse


Setup Instructions
Clone the repo:

1.
git clone https://github.com/ranjeet13950/QuizApp.git
cd QuizApp

2.Update your application.properties with your MySQL config:
spring.datasource.url=jdbc:mysql://localhost:3306/quizdb
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update

3.Run the application:
mvn spring-boot:run

4.Test endpoints using Postman or browser:
http://localhost:8080/Question/allQuestion


🧑‍💻 Developer
Ranjeet Kumar
📧 kumarranjeet13950@gmail.com
