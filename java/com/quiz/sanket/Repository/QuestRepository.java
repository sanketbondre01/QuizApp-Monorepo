package com.quiz.sanket.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.quiz.sanket.Entities.Question;

public interface QuestRepository extends JpaRepository<Question, Long> {

	@Query(value = "SELECT * FROM question q WHERE q.category = :category AND q.level = :level ORDER BY RAND() LIMIT 10", nativeQuery = true)
	List<Question> findRandomQuestionsByCategoryAndLevel(String category, String level);


}
