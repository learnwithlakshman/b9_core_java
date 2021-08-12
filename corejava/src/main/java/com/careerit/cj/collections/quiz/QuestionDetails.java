package com.careerit.cj.collections.quiz;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class QuestionDetails {

		private int number;
		private String question;
		private List<String> answers;
		private String correctAnswer;
}
