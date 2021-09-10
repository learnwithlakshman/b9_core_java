package com.careerit.score;

public class EmployeeService {

		private Greetings greet;

		
		
		public EmployeeService(Greetings greet) {
			this.greet = greet;
		}

		public void showGreetings() {
			System.out.println(greet.getMessage());
		}

		public Greetings getGreet() {
			return greet;
		}

		public void setGreet(Greetings greet) {
			this.greet = greet;
		}

		
		
		
}
