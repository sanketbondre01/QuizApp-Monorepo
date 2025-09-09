package com.quiz.sanket.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.quiz.sanket.Entities.QuestionWrapper;
import com.quiz.sanket.Entities.Quiz;
import com.quiz.sanket.Entities.Response;
import com.quiz.sanket.Services.QuizServices;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequiredArgsConstructor
@Slf4j
@RequestMapping("/api/v1/quiz")
public class QuizController {

		private final QuizServices quizService;
		
		@PostMapping("/create")
		public Quiz createQuiz(
				@RequestParam String category,
				@RequestParam String level,
				@RequestParam String title){
					return quizService.createQuiz(category, level, title);
					
				}
		
		@GetMapping("/getQuizByID/{id}")
		public List<QuestionWrapper> getQuizQuestions(@PathVariable Integer id){
			return quizService.getQuizQuestions(id);
		}
		
		@PostMapping("/submiQuiz/{id}")
		public String submitQuiz(@PathVariable Integer id, @RequestBody List<Response> responses) {
			return quizService.calculateResult(id, responses);
		}
}
