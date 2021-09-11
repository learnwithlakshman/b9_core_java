package com.careerit.springcore.scopes;

import javax.inject.Provider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class TaskManager {

	@Autowired
	private TaskService taskService;

	

	public TaskManager() {
		log.info(" ===>   Constructor of " + this.getClass().getSimpleName());
	}

	public void showTasks() {
		log.info("It is going to show all active tasks");
	}

	@Override
	public String toString() {
		return "TaskManager [taskService=" + taskService + "]";
	}

}
