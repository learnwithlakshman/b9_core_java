package com.careerit.cj.strexamples;

class Employee {
	private int id;
	private String name;
	private String email;
	private String company;

	public Employee(int id, String name, String email, String company) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.company = company;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public String getCompany() {
		return company;
	}

}

public class StringSplitExample {

	public static void main(String[] args) {

		String data = "1001-Krish-krish.t@gmail.com-Wipro,1002-Rajesh-rajesh.t@gmail.com-TCS,1003-Manoj-manoj.pvn@gmail.com-CTS,1005-Mahesh-mahesh.c@gmail.com-SoftBank";
		String[] empdata = data.split(",");
		Employee[] empArr = new Employee[empdata.length];

		int i = 0;
		for (String d : empdata) {
			String[] arr = d.split("-");
			Employee emp = new Employee(Integer.parseInt(arr[0]), arr[1], arr[2], arr[3]);
			empArr[i++] = emp;
		}
		for(Employee emp:empArr) {
			System.out.println(empInfo(emp));
			System.out.println("-------------------------");
		}

	}

	private static String empInfo(Employee emp) {
		StringBuilder sb = new StringBuilder();
		sb.append("Empno :").append(""+emp.getId()).append("\nEname: ").append(emp.getName()).append("\nCompany: ").append(emp.getCompany());
		return sb.toString();
	}

}
