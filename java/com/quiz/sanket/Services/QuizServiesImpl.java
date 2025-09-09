package com.quiz.sanket.Services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.quiz.sanket.Entities.Question;
import com.quiz.sanket.Entities.QuestionWrapper;
import com.quiz.sanket.Entities.Quiz;
import com.quiz.sanket.Entities.Response;
import com.quiz.sanket.Exceptions.QuizNotFoundException;
import com.quiz.sanket.Repository.QuestRepository;
import com.quiz.sanket.Repository.QuizRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class QuizServiesImpl implements QuizServices {

    private final QuizRepository quizRepository;
    private final QuestRepository questionRepository;

    @Override
    public Quiz createQuiz(String category, String level, String title) {
        List<Question> questions = questionRepository.findRandomQuestionsByCategoryAndLevel(category, level);

        Quiz quiz = new Quiz();
        quiz.setQuizTitle(title);
        quiz.setQuestions(questions);

        return quizRepository.save(quiz);
    }

    @Override
    public List<QuestionWrapper> getQuizQuestions(Integer id) {
        Optional<Quiz> quiz = quizRepository.findById(id);

        if (quiz.isEmpty()) {
            return new ArrayList<>();
        }

        List<QuestionWrapper> wrap = new ArrayList<>();
        for (Question q : quiz.get().getQuestions()) {
            wrap.add(new QuestionWrapper(
                    q.getId(),
                    q.getQuestionTitle(),
                    q.getOption1(),
                    q.getOption2(),
                    q.getOption3(),
                    q.getOption4()
            ));
        }

        return wrap;
    }

    @Override
    public String calculateResult(Integer quizId, List<Response> responses) {
        Optional<Quiz> quizOpt = quizRepository.findById(quizId);

        if (quizOpt.isEmpty()) {
            throw new QuizNotFoundException("Quiz not found with id: " + quizId);
        }

        List<Question> questions = quizOpt.get().getQuestions();
        int score = 0;

        for (Response response : responses) {
            for (Question q : questions) {
                if (q.getId().equals(response.getId())) {
                    if (q.getCorrectAnswer().equalsIgnoreCase(response.getUserAnswer())) {
                        score++;
                    }
                    break;
                }
            }
        }

        return "Your Score is : " + score;
    }

	

}
