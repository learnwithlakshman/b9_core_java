package com.careerit.cj.singleton;

public class Driver {

	public static void main(String[] args) {

		TaskManager tm1 = TaskManager.getInstance();
		TaskManager tm2 = TaskManager.getInstance();
		TaskManager tm3 = TaskManager.getInstance();

		System.out.println(tm1);
		System.out.println(tm2);
		System.out.println(tm3);
		tm1.showActiveTasks();
		tm2.showActiveTasks();
		tm3.showActiveTasks();
		
		System.out.println(NumberOperations.isEven(123));
		String fileName = "";
		if(fileName.endsWith("csv")) {
			ReaderUtil.readFromCsv(fileName);
		}

	}

}
