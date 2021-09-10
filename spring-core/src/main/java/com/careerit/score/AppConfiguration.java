package com.careerit.score;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.lwl.stat.common.NumberOperations;

@Configuration
public class AppConfiguration {

		@Bean
		public Greetings greetings() {
			return new Greetings();
		}
		
		@Bean
		public EmployeeService employeeService() {
			return new EmployeeService(greetings());
		}
		
		@Bean
		public NumberOperations numberOperations() {
			return new NumberOperations();
		}
}
