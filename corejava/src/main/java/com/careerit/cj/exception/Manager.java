package com.careerit.cj.exception;

class TaskManager implements Cloneable {

	private static TaskManager obj;

	private TaskManager() {

	}

	public static TaskManager getIntstance() {

		if (obj == null) {
			obj = new TaskManager();
		}
		return obj;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException("This object can't be cloned");
	}

}

public class Manager {

	public static void main(String[] args) throws CloneNotSupportedException {
		
				TaskManager obj1 = TaskManager.getIntstance();
				TaskManager obj2 = TaskManager.getIntstance();
				TaskManager obj3 = (TaskManager) obj1.clone();
				System.out.println(obj1);
				System.out.println(obj2);
				System.out.println(obj3);
				
	}
}
