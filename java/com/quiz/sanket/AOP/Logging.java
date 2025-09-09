package com.quiz.sanket.AOP;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Aspect
@Component
@Slf4j
public class Logging {

    @Before("execution(* com.quiz.jagadeesh.Controller.QuestController.addQuestion(..))")
    public void logBeforeAddQuestion() {
        log.warn("Adding a new question...");
    }

    @AfterReturning("execution(* com.quiz.jagadeesh.Controller.QuestController.addQuestion(..))")
    public void logAfterSuccessfulAddQuestion() {
        log.warn("Question added successfully.");
    }

    @Before("execution(* com.quiz.jagadeesh.Controller.QuestController.getAllQuestions(..))")
    public void logBeforeGetAllQuestions() {
        log.warn("Fetching all questions...");
    }

    @AfterReturning("execution(* com.quiz.jagadeesh.Controller.QuestController.getAllQuestions(..))")
    public void logAfterSuccessfulGetAllQuestions() {
        log.warn("All questions fetched successfully.");
    }

   
    @Before("execution(* com.quiz.jagadeesh.Controller.QuestController.updateQuestion(..))")
    public void logBeforeUpdateQuestion() {
        log.warn("Updating a question...");
    }

    @AfterReturning("execution(* com.quiz.jagadeesh.Controller.QuestController.updateQuestion(..))")
    public void logAfterSuccessfulUpdateQuestion() {
        log.warn("Question updated successfully.");
    }

    @Before("execution(* com.quiz.jagadeesh.Controller.QuestController.deleteQuestion(..))")
    public void logBeforeDeleteQuestion() {
        log.warn("Deleting a question...");
    }

    @AfterReturning("execution(* com.quiz.jagadeesh.Controller.QuestController.deleteQuestion(..))")
    public void logAfterSuccessfulDeleteQuestion() {
        log.warn("Question deleted successfully.");
    }

    @Before("execution(* com.quiz.jagadeesh.Controller.QuestController.patchQuestion(..))")
    public void logBeforePatchQuestion() {
        log.warn("Patching a question...");
    }

    @AfterReturning("execution(* com.quiz.jagadeesh.Controller.QuestController.patchQuestion(..))")
    public void logAfterSuccessfulPatchQuestion() {
        log.warn("Question patched successfully.");
    }

   
    @Before("execution(* com.quiz.jagadeesh.Controller.QuestController.getQuestionbyId(..))")
    public void logBeforeGetQuestionById() {
        log.warn("Fetching question by ID...");
    }

    @AfterReturning("execution(* com.quiz.jagadeesh.Controller.QuestController.getQuestionbyId(..))")
    public void logAfterSuccessfulGetQuestionById() {
        log.warn("Question fetched successfully by ID.");
    }
    
    @Before("execution(* com.quiz.jagadeesh.Controller.QuizController.createQuiz(..))")
    public void logBeforeCreateQuiz() {
        log.warn("Creating a new quiz...");
    }

    @AfterReturning("execution(* com.quiz.jagadeesh.Controller.QuizController.createQuiz(..))")
    public void logAfterSuccessfulCreateQuiz() {
        log.warn("Quiz created successfully.");
    }

    @Before("execution(* com.quiz.jagadeesh.Controller.QuizController.getQuizQuestions(..))")
    public void logBeforeGetQuizQuestions() {
        log.warn("Fetching quiz questions by ID...");
    }

    @AfterReturning("execution(* com.quiz.jagadeesh.Controller.QuizController.getQuizQuestions(..))")
    public void logAfterSuccessfulGetQuizQuestions() {
        log.warn("Quiz questions fetched successfully.");
    }

    @Before("execution(* com.quiz.jagadeesh.Controller.QuizController.submitQuiz(..))")
    public void logBeforeSubmitQuiz() {
        log.warn("Submitting quiz...");
    }

    @AfterReturning("execution(* com.quiz.jagadeesh.Controller.QuizController.submitQuiz(..))")
    public void logAfterSuccessfulSubmitQuiz() {
        log.warn("Quiz submitted successfully.");
    }
}
