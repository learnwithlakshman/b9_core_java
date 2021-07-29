package com.careerit.cj.oop;

import java.util.Objects;

class Employee{
	
		private int empno;
		private String name;
		private double salary;
		
		public Employee(int empno, String name, double salary) {
			this.empno = empno;
			this.name = name;
			this.salary = salary;
		}

		@Override
		public int hashCode() {
			return Objects.hash(empno, name, salary);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Employee other = (Employee) obj;
			return empno == other.empno && Objects.equals(name, other.name)
					&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
		}

		@Override
		public String toString() {
			return "Employee [empno=" + empno + ", name=" + name + ", salary=" + salary + "]";
		}
		
		
}

public class Client {

		public final static void main(final String... args) {
			
				Employee emp1 = new Employee(1001, "Krish", 98000);
				Employee emp2 = new Employee(1001, "Krish", 98000);

				System.out.println(emp1 == emp2);
				System.out.println(emp1.equals(emp2));
			
				System.out.println(emp1);
				System.out.println(emp2);
		}
}
