package com.ashifali.EnhancedTaskTracker.services;

import java.util.List;

import com.ashifali.EnhancedTaskTracker.entities.Task;

public interface TaskService {

	public List<Task> getAllTasks();
	public Task addTask(Task task);
	public String completeTask(int id);
	public List<Task> listTaskByPriority(String priority);
	public List<Task> listTaskByCategory(String category);
	public List<Task> listTaskByStatus(String status);
}
