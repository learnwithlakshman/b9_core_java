package com.careerit.cj.arrays;

enum Dept {
	DEV, QA, SALES
}

public class Employee {

	private String empno;
	private String ename;
	private double salary;
	private Dept dept;

	public Employee(String empno, String ename, double salary,Dept dept) {
		this.empno = empno;
		this.ename = ename;
		this.salary = salary;
		this.dept = dept;
	}

	public void showDetails() {
		System.out.println("Empno  :" + empno);
		System.out.println("Ename  :" + ename);
		System.out.println("Salary :" + salary);
		System.out.println("Dept   :" + dept);
	}

	public String getEmpno() {
		return empno;
	}

	public String getEname() {
		return ename;
	}

	public double getSalary() {
		return salary;
	}

	public Dept getDept() {
		return dept;
	}

	public void setEmpno(String empno) {
		this.empno = empno;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void setDept(Dept dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", ename=" + ename + ", salary=" + salary + ", dept=" + dept + "]";
	}
	
	

}
