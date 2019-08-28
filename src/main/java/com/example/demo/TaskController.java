package com.example.demo;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskController {

	@Autowired
	TaskRepository repo;

	@CrossOrigin(origins = "http://localhost:3000")
	@RequestMapping("/tasks")
	List<Task> index() {
		return repo.findAll();
	}

	@CrossOrigin(origins = "http://localhost:3000")
	@RequestMapping("/addTask")
	Task addBook(@RequestBody Task task) {
		System.out.print(task);
		repo.save(task);
		return task;

	}

	@CrossOrigin(origins = "http://localhost:3000")
	@RequestMapping("/deleteTask")
	Task deleteBook(@RequestBody Task task) {
		System.out.print(task);
		repo.delete(task);
		return task;
	}

	@CrossOrigin(origins = "http://localhost:3000")
	@RequestMapping("/editTask")
	Task editBook(@RequestBody Task task) {
		repo.save(task);
		return task;
	}

}
