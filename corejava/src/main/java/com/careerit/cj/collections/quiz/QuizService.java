package com.careerit.cj.collections.quiz;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class QuizService {

		private JsonReaderUtil obj;
		
		
	
		public QuizService() {
			obj = new JsonReaderUtil();
		}



		public void startQuiz() throws InterruptedException {
			
				Quiz quiz = obj.loadJsonQuizJSONData();
				
				System.out.println("Quiz name      : "+quiz.getConcept().getName());
				System.out.println("Question count : "+quiz.getConcept().getQuestionCount());
				
				System.out.println("Please wait your quiz is going load soon................");
				TimeUnit.SECONDS.sleep(3);
				
				List<QuestionDetails> questionsList = quiz.getQuestions();
				
				// logic
		}
}
