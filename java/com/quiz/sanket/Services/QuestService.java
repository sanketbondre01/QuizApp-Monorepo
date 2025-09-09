package com.quiz.sanket.Services;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.quiz.sanket.Entities.Question;

public interface QuestService {

	Question addQuestion(Question question);

	Question updateQuestion(Long id, Question question);

	void deleteQuestion(Long id);

	Question updatePatchQuestion(Long id, Question patchQuestion);

	Question getQuestionById(Long id);

	Page<Question> getAllQuestions(Pageable pageable);

}
