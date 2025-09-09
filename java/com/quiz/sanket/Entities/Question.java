package com.quiz.sanket.Entities;
import jakarta.persistence.*;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Question {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	
	@NotBlank
	private String QuestionTitle;
	
	@NotBlank
	private String Option1;
	
	@NotBlank
	private String Option2;
	
	@NotBlank
	private String Option3;
	
	@NotBlank
	private String Option4;
	
	@NotBlank
	private String CorrectAnswer;
	
	@NotNull
	@Enumerated(EnumType.STRING)
	private Level level;
	
	public enum Level{
		EASY,
		MEDIUM,
		HARD
	}
	
	@NotNull
	@Enumerated(EnumType.STRING)
	private Category category;
	public enum Category{
		JAVA,
		SPRING,
		GIT,
		SpringBoot
		
	}
	

}
