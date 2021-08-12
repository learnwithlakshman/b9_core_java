package com.careerit.cj.collections.quiz;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Quiz {

		private Concept concept;
		private List<QuestionDetails> questions;
}
