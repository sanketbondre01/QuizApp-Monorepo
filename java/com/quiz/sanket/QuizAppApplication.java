package com.quiz.sanket;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.quiz.sanket.Entities.Question;
import com.quiz.sanket.Entities.Question.Category;
import com.quiz.sanket.Entities.Question.Level;
import com.quiz.sanket.Repository.QuestRepository;

@SpringBootApplication
public class QuizAppApplication implements ApplicationRunner {

    @Autowired
    private QuestRepository questRepository;

    public static void main(String[] args) {
        SpringApplication.run(QuizAppApplication.class, args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        if (questRepository.count() == 0) { 
            Question q1 = new Question(null,
                    "What is JPA in Java?",
                    "Java Persistence API", "Java Programming Application", "Java Process Architecture", "None of these",
                    "Java Persistence API",
                    Level.EASY,
                    Category.JAVA
            );
            
            Question q2 = new Question(null,
                    "Which keyword is used to define a class in Java?",
                    "class", "method", "object", "package",
                    "class",
                    Level.EASY,
                    Category.JAVA
            );

            Question q3 = new Question(null,
                    "What is the correct main method signature in Java?",
                    "public static void main", "main void public static", "void static public main", "public void static main",
                    "public static void main",
                    Level.EASY,
                    Category.JAVA
            );

            Question q4 = new Question(null,
                    "Which keyword is used to declare an integer variable in Java?",
                    "integer", "number", "int", "num",
                    "int",
                    Level.EASY,
                    Category.JAVA
            );

            Question q5 = new Question(null,
                    "Which statement is used to print text in Java?",
                    "echo", "System.out.print", "System.out.println", "print()",
                    "System.out.println",
                    Level.EASY,
                    Category.JAVA
            );

            Question q6 = new Question(null,
                    "Which keyword is used to create an object in Java?",
                    "create", "new", "make", "object",
                    "new",
                    Level.EASY,
                    Category.JAVA
            );

            Question q7 = new Question(null,
                    "Which keyword is used for inheritance in Java?",
                    "implements", "inherits", "extends", "includes",
                    "extends",
                    Level.EASY,
                    Category.JAVA
            );

            Question q8 = new Question(null,
                    "What is the boolean value for true in Java?",
                    "yes", "1", "true", "on",
                    "true",
                    Level.EASY,
                    Category.JAVA
            );

            Question q9 = new Question(null,
                    "What is the default value of a reference variable in Java?",
                    "none", "void", "null", "empty",
                    "null",
                    Level.EASY,
                    Category.JAVA
            );

            Question q10 = new Question(null,
                    "Which keyword is used for conditional statements in Java?",
                    "if", "when", "check", "compare",
                    "if",
                    Level.EASY,
                    Category.JAVA
            );

            Question q11 = new Question(null,
                    "Which keyword is used to write a loop that repeats a fixed number of times?",
                    "loop", "iterate", "for", "while",
                    "for",
                    Level.EASY,
                    Category.JAVA
            );

            Question q12 = new Question(null,
                    "Which annotation is used to create a REST Controller in Spring?",
                    "@Controller", "@RestController", "@Service", "@Component",
                    "@RestController",
                    Level.MEDIUM,
                    Category.SPRING
            );

            Question q13 = new Question(null,
                    "What does 'git init' do?",
                    "Initializes a new Git repository", "Installs Git", "Deletes a Git repo", "None of the above",
                    "Initializes a new Git repository",
                    Level.EASY,
                    Category.GIT
            );

            Question q14 = new Question(null,
                    "What is the default port of Spring Boot?",
                    "8080", "8000", "9090", "443",
                    "8080",
                    Level.EASY,
                    Category.SpringBoot
            );
            
            Question q15 = new Question(null,
                    "What is the Hibernate?",
                    "ORM Framework", "Entity", "Database", "API",
                    "ORM Framework",
                    Level.EASY,
                    Category.SpringBoot
            );
            
            

            questRepository.save(q1);
            questRepository.save(q2);
            questRepository.save(q3);
            questRepository.save(q4);
            questRepository.save(q5);
            questRepository.save(q6);
            questRepository.save(q7);
            questRepository.save(q8);
            questRepository.save(q9);
            questRepository.save(q10);
            questRepository.save(q11);
            questRepository.save(q12);
            questRepository.save(q13);
            questRepository.save(q14);
            questRepository.save(q15);

        } else {
           
        }
    }


}
