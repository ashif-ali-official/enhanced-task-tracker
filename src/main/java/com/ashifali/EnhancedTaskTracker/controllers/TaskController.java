package com.ashifali.EnhancedTaskTracker.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ashifali.EnhancedTaskTracker.entities.Task;
import com.ashifali.EnhancedTaskTracker.services.TaskService;

@RestController
@RequestMapping("/tasks")
public class TaskController {

	@Autowired
	private TaskService taskService;
	
	@GetMapping("/allTask")
	public List<Task> getAllTasks() {
		return taskService.getAllTasks();
	}
	
	@PostMapping("/addTask")
	public Task addTask(@RequestBody Task task) {
		return taskService.addTask(task);
	}

	
	@PutMapping("/updateTask/{id}")
	public String completeTask(@PathVariable int id) {
		return taskService.completeTask(id);
	}

	@GetMapping("/priority/{priority}")
	public List<Task> listTaskByPriority(@PathVariable String priority) {
		return taskService.listTaskByPriority(priority);
	}

	@GetMapping("/category/{category}")
	public List<Task> listTaskByCategory(@PathVariable String category) {
		return taskService.listTaskByCategory(category);
	}

	@GetMapping("/status/{status}")
	public List<Task> listTaskByStatus(@PathVariable String status) {
		return taskService.listTaskByStatus(status);
	}
	
}
