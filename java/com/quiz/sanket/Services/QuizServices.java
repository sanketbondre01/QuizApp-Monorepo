package com.quiz.sanket.Services;

import java.util.List;

import com.quiz.sanket.Entities.QuestionWrapper;
import com.quiz.sanket.Entities.Quiz;
import com.quiz.sanket.Entities.Response;

public interface QuizServices {

	Quiz createQuiz(String category, String level, String title);

	List<QuestionWrapper> getQuizQuestions(Integer id);

	String calculateResult(Integer id, List<Response> responses);

	

	


	

}
