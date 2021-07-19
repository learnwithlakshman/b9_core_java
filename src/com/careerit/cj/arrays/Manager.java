package com.careerit.cj.arrays;

public class Manager {
	public static void main(String[] args) {

		Employee emp1 = new Employee("1001", "Krish", 95000, Dept.DEV);
		Employee emp2 = new Employee("1002", "Manoj", 95000, Dept.SALES);
		Employee emp3 = new Employee("1003", "Aruna", 25000, Dept.SALES);
		Employee emp4 = new Employee("1004", "Anish", 20000, Dept.SALES);
		Employee emp5 = new Employee("1005", "Nirmala", 42000, Dept.DEV);
		Employee emp6 = new Employee("1006", "Abhisahik", 20000, Dept.QA);
		Employee emp7 = new Employee("1007", "Sunny", 62000, Dept.QA);
		Employee emp8 = new Employee("1008", "Rajesh", 52000, Dept.SALES);
		Employee emp9 = new Employee("1009", "Charan", 82000, Dept.DEV);
		Employee emp10 = new Employee("1010", "Spandana", 95000, Dept.DEV);

		Employee[] empArr = { emp1, emp2, emp3, emp4, emp5, emp6, emp7, emp8, emp9, emp10 };

//		for (int i = 0; i < empArr.length; i++) {
//			Employee emp = empArr[i];
//			emp.showDetails();
//			System.out.println("-------------------------");
//		}
//
//		// Get only first n employee
//		System.out.println("-------------- n employee details ---------------------");
//		int n = 3;
//		for (int i = empArr.length - n; i < empArr.length; i++) {
//			Employee emp = empArr[i];
//			emp.showDetails();
//			System.out.println("-------------------------");
//		}
//
//		for (int i = empArr.length - 1; i >= 0; i--) {
//			Employee emp = empArr[i];
//			emp.showDetails();
//			System.out.println("-------------------------");
//		}
//		
//		for(Employee emp : empArr) {
//			emp.showDetails();
//		}

		showEmployeeNames(empArr);
		showEmployeeNameAndSalry(empArr, Dept.DEV);
		showSummaryOf(empArr,Dept.SALES);

	}

	public static void showSummaryOf(Employee[] arr, Dept dept) {
	
		Employee[] deptArr = employeesOf(arr, dept);
		int count = deptArr.length;
		double total = totalSalary(deptArr);
		double max = maxSalary(deptArr);
		double min = minSalary(deptArr);
		double avg = total / deptArr.length;
		System.out
				.println("Dept :" + dept + " has " + count + " employees, Max " + max + ", Min " + min + " Avg " + avg);

	}

	public static Employee[] employeesOf(Employee[] arr, Dept dept) {
		int count = countOf(arr, dept);
		Employee[] temp = new Employee[count];
		int i = 0;
		for (Employee emp : arr) {
			if (emp.getDept() == dept) {
				temp[i++] = emp;
			}
		}
		return temp;
	}

	public static double totalSalary(Employee[] arr) {
		double total = 0;
		for (Employee emp : arr) {
			total += emp.getSalary();
		}
		return total;
	}

	public static int countOf(Employee[] arr, Dept dept) {
		int count = 0;
		for (Employee emp : arr) {
			if (emp.getDept() == dept) {
				count++;
			}
		}
		return count;
	}

	public static void showEmployeeNames(Employee[] arr) {
		for (Employee emp : arr) {
			System.out.println(emp.getEname());
		}
	}

	public static void showEmployeeNameAndSalry(Employee[] arr, Dept dept) {
		for (Employee emp : arr) {
			if (emp.getDept() == dept) {
				System.out.println(emp.getEname() + " " + emp.getSalary());
			}
		}
	}

	public static void showMaxSalaryEmployee(Employee[] arr) {
		double max = maxSalary(arr);
		for (Employee emp : arr) {
			if (emp.getSalary() == max) {
				System.out.println(emp.getEname() + " " + emp.getSalary());
			}
		}
	}

	public static void showMinSalaryEmployee(Employee[] arr) {
		double max = maxSalary(arr);
		for (Employee emp : arr) {
			if (emp.getSalary() == max) {
				System.out.println(emp.getEname() + " " + emp.getSalary());
			}
		}
	}

	public static double minSalary(Employee[] arr) {
		double min = arr[0].getSalary();
		for (int i = 1; i < arr.length; i++) {
			if (min > arr[i].getSalary()) {
				min = arr[i].getSalary();
			}
		}
		return min;
	}

	public static double maxSalary(Employee[] arr) {
		double max = arr[0].getSalary();
		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i].getSalary()) {
				max = arr[i].getSalary();
			}
		}
		return max;
	}

}
