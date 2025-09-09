# QuizApp Monorepo

## Project Overview
QuizApp is a comprehensive monorepo project designed to manage quizzes and questions. It offers full CRUD functionalities for both quizzes and questions, integrated with a MySQL database, Swagger API documentation, and robust exception handling.

## Monorepo 
A Monorepo (short for Monolithic Repository) is a software development strategy where the code for multiple projects, applications, or services is stored in a single repository, rather than having separate repositories for each project.
---

## 📚 Project Structure

### 1. **QuestionController Endpoints**
- `POST /addQuestion` – Add a new question
- `GET /getAllQuestions` – Retrieve all questions (supports pagination)
- `PUT /update/{id}` – Update an existing question by ID
- `DELETE /delete/{id}` – Delete a question by ID
- `PATCH /patch/{id}` – Partially update a question by ID
- `GET /getQuestion/{id}` – Get a specific question by ID

### 2. **QuizController Endpoints**
- `POST /create` – Create a new quiz
- `GET /getQuizByID/{id}` – Get quiz details by ID
- `POST /submiQuiz/{id}` – Submit a quiz attempt

---

## ⚙️ Technologies Used
- **Backend:** Spring Boot, Spring MVC
- **Database:** MySQL
- **API Documentation:** Swagger UI
- **Exception Handling:** Custom exceptions like `QuizNotFoundException` and `QuestionNotFoundException`

---

## 🔧 Database
The application uses a MySQL database for storing quizzes and questions.

---

## 🚀 Running the Application
1. Configure the `application.properties` for database connection.
2. Run the Spring Boot application.
3. Use Swagger API UI to interact with endpoints:
   - Accessible at: `/swagger-ui.html`

---

## Documentation
- Includes console logs for debugging
- Displays screenshots of exceptions for better error handling visualization
- Swagger API screenshots for easy reference

---

## ⚡ Future Improvements
- Add unit and integration tests
- Implement security features (JWT Authentication)
- Improve UI for better user experience

Feel free to clone and contribute to the project! 🎉
