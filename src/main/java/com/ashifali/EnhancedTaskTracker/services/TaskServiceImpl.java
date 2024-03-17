package com.ashifali.EnhancedTaskTracker.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ashifali.EnhancedTaskTracker.entities.Task;
import com.ashifali.EnhancedTaskTracker.repositories.TaskRepository;

@Service
public class TaskServiceImpl implements TaskService {

	
	private TaskRepository taskRepository = new TaskRepository();
	
	@Override
	public Task addTask(Task task) {
		return taskRepository.addTask(task);
	}

	@Override
	public String completeTask(int id) {
		return taskRepository.completeTask(id);
	}

	@Override
	public List<Task> listTaskByPriority(String priority) {
		return taskRepository.listTaskByPriority(priority);
	}

	@Override
	public List<Task> listTaskByCategory(String category) {
		return taskRepository.listTaskByCategory(category);
	}

	@Override
	public List<Task> listTaskByStatus(String status) {
		return taskRepository.listTaskByStatus(status);
	}

	@Override
	public List<Task> getAllTasks() {
		return taskRepository.getAllTasks();
	}

}
