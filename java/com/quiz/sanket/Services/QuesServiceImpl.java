package com.quiz.sanket.Services;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.quiz.sanket.Entities.Question;
import com.quiz.sanket.Exceptions.QuestionNotFoundException;
import com.quiz.sanket.Repository.QuestRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class QuesServiceImpl implements QuestService{
	
	private final QuestRepository questRepository;

	@Override
	public Question addQuestion(Question question) {
		
		return questRepository.save(question);
	}

	@Override
	public Page<Question> getAllQuestions(Pageable pageable) {
		
		return questRepository.findAll(pageable);
	}

	@Override
	public Question updateQuestion(Long id, Question question) {
		        Question existing = questRepository.findById(id).orElseThrow();
		        existing.setQuestionTitle(question.getQuestionTitle());
		        existing.setOption1(question.getOption1());
		        existing.setOption2(question.getOption2());
		        existing.setOption3(question.getOption3());
		        existing.setOption4(question.getOption4());
		        existing.setCorrectAnswer(question.getCorrectAnswer());
		        existing.setCategory(question.getCategory());
		        existing.setLevel(question.getLevel());
		        return questRepository.save(existing);
		    }

	@Override
	 public void deleteQuestion(Long id) {
        questRepository.deleteById(id);
    }


	@Override
	public Question updatePatchQuestion(Long id, Question patchQuestion) {
	    Question existing = questRepository.findById(id)
	            .orElseThrow(() -> new QuestionNotFoundException(id));

	    if (patchQuestion.getQuestionTitle() != null) existing.setQuestionTitle(patchQuestion.getQuestionTitle());
	    if (patchQuestion.getOption1() != null) existing.setOption1(patchQuestion.getOption1());
	    if (patchQuestion.getOption2() != null) existing.setOption2(patchQuestion.getOption2());
	    if (patchQuestion.getOption3() != null) existing.setOption3(patchQuestion.getOption3());
	    if (patchQuestion.getOption4() != null) existing.setOption4(patchQuestion.getOption4());
	    if (patchQuestion.getCorrectAnswer() != null) existing.setCorrectAnswer(patchQuestion.getCorrectAnswer());
	    if (patchQuestion.getLevel() != null) existing.setLevel(patchQuestion.getLevel());
	    if (patchQuestion.getCategory() != null) existing.setCategory(patchQuestion.getCategory());

	    return questRepository.save(existing);
	}

	@Override
	public Question getQuestionById(Long id) {
	    try {
	        return questRepository.findById(id).get();
	    } catch (Exception e) {
	        throw new RuntimeException("Question not found with id: " + id);
	    }
	}

	



	

}
