package com.careerit.springcore.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ActivityService {

		
		private final Parser parser;
		
		@Autowired
		public ActivityService(Parser parser) {
			this.parser = parser;
		}
		
		public void showActivities(String file) {
			System.out.println(parser.getActivities(file));
		}
		
		
}
