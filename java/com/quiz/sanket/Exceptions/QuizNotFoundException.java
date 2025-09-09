package com.quiz.sanket.Exceptions;


public class QuizNotFoundException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public QuizNotFoundException(String message) {
        super("Quiz Not found !");
    }
}
