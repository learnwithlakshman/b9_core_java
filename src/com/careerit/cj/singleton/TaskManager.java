package com.careerit.cj.singleton;

public final class TaskManager {

	private static TaskManager obj;

	private TaskManager() {
	}

	public static TaskManager getInstance() {
		if (obj == null) {
			obj = new TaskManager();
		}
		return obj;
	}

	public void showActiveTasks() {
		System.out.println("It displays all the active tasks");
	}

}
