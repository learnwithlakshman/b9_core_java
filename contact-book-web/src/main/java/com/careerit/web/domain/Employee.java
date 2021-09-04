package com.careerit.web.domain;

public class Employee {

		private int id;
		private String name;
		private String email;
		private String gender;
		private float salary;
		
		public Employee() {
			super();
		}
		public Employee(int id, String name, String email, String geder, float salary) {
			this.id = id;
			this.name = name;
			this.email = email;
			this.gender = geder;
			this.salary = salary;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String geder) {
			this.gender = geder;
		}
		public float getSalary() {
			return salary;
		}
		public void setSalary(float salary) {
			this.salary = salary;
		}
		
		
}
