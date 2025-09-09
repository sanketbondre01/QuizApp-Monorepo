package com.quiz.sanket.Controller;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quiz.sanket.Entities.Question;
import com.quiz.sanket.Services.QuestService;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("api/v1/questions")
@RequiredArgsConstructor
public class QuestController {
	
	private final QuestService questService;
	
	@PostMapping("/addQuestion")
	public Question addQuestion(@Valid @RequestBody Question question) {
		return questService.addQuestion(question);
	}
	
	@GetMapping("/getAllQuestions")
	public Page<Question> getAllQuestions(Pageable pageable) {
		return questService.getAllQuestions(pageable);
	}
	
	@PutMapping("/update/{id}")
	public Question updateQuestion(@PathVariable Long id, @Valid @RequestBody Question question) {
		return questService.updateQuestion(id, question);
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteQuestion(@PathVariable Long id) {
		questService.deleteQuestion(id);
	}
	
	@PatchMapping("patch/{id}")
	public Question patchQuestion(@PathVariable Long id,@Valid  @RequestBody Question patchQuestion) {
	    Question updated = questService.updatePatchQuestion(id, patchQuestion);
	    return updated;
	}
	
	@GetMapping("getQuestion/{id}")
	public Question getQuestionbyId(@PathVariable Long id) {
		return questService.getQuestionById(id);
	}

	
	

}
