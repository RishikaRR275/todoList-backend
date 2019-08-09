package com.example.demo;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity	
public class Task {
	@Id
	private String taskName;

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	@Override
	public String toString() {
		return "Task [taskName=" + taskName + "]";
	}
	
}
