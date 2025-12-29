# 📚 Subject Management REST API

A simple Spring Boot REST API to manage subjects using CRUD operations.
This project demonstrates how GET, POST, PUT, DELETE work in a RESTful backend.

---

## 🚀 Features
- Create new subject  
- Fetch all subjects  
- Fetch subject by ID  
- Update subject details  
- Delete subject  
- REST API based architecture  
- Tested using Postman  

---

## 🛠️ Tech Stack
- Java  
- Spring Boot  
- Maven  
- REST API  
- Postman  

---

## 📂 Project Structure
src/main/java  
 └── com.example.subject  
     ├── controller  
     ├── service  
     ├── repository  
     └── model  

---

## 🔗 API Endpoints

Get All Subjects  
GET /subjects  

Get Subject by ID  
GET /subjects/{id}  

Create Subject  
POST /subjects  
Request Body:
{
  "name": "DBMS",
  "code": "CS301"
}

Update Subject  
PUT /subjects/{id}  
Request Body:
{
  "name": "Advanced DBMS",
  "code": "CS401"
}

Delete Subject  
DELETE /subjects/{id}  

---

## ▶️ How to Run the Project

1. Clone the repository  
git clone https://github.com/your-username/subject-management-api.git  

2. Open project in IntelliJ / Eclipse  

3. Run the Spring Boot main class  

4. Server will start on  
http://localhost:8080  

---

## 📦 Maven
All dependencies are managed using pom.xml.

---

## 📖 Learning Outcomes
- Understanding REST API concepts  
- Working with HTTP methods  
- Spring Boot project structure  
- Backend CRUD operations  

---

## 👨‍💻 Author
Mukesh Chauhan  
B.Tech (CSE-AI)

---

## ⭐ Support
If you find this project useful, give it a star on GitHub.
