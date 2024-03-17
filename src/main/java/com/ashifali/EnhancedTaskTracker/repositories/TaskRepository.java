package com.ashifali.EnhancedTaskTracker.repositories;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.ashifali.EnhancedTaskTracker.entities.Task;

public class TaskRepository {

	private List<Task> taskList = new ArrayList<>();
	
	public TaskRepository() {
		taskList.add(new Task(1,"Organize team meeting",new Date(2024,04,05),"Medium","Work","Completed",0));
		taskList.add(new Task(2,"Update website content",new Date(2024,04,10),"High","Marketing","Pending",0));
		taskList.add(new Task(3,"Plan birthday party",new Date(2024,04,15),"Low","Personal","Pending",2));
	}
	
	public Task addTask(Task task) {
		taskList.add(task);
		return task;
	}
	
	public String completeTask(int id) {
		for(Task task:taskList) {
			if(id==task.getId()) {
				int dependsOn = task.getDependsOn();
				if(dependsOn == 0) {
					task.setStatus("Completed");
					return "Task: "+ task.getDescription() +"; Completed Successfully!!!"; 
				} else {
					for(Task task2:taskList) {
						if(task != task2) {
							if(task2.getId() == dependsOn) {
								if(task2.getStatus().equals("Completed")) {
									task.setStatus("Completed");
									return "Task: "+ task.getDescription() +"; Completed Successfully!!!";
								} else {
									return "Task: "+ task.getDescription() +" is dependent on Task: "+ task2.getDescription()+"; Dependent task needs to be completed first.";
								}
							} 
						}
					}
				}		
			}
		}
		return "";
	}
	
	public List<Task> listTaskByPriority(String priority){
		
		List<Task> resultList = new ArrayList<>();
		for(Task task:taskList) {
			if(task.getPriority().equals(priority)) {
				resultList.add(task);
			}
		}
		
		return resultList;
	}
	
	public List<Task> listTaskByCategory(String category){
		
		List<Task> resultList = new ArrayList<>();
		for(Task task:taskList) {
			if(task.getCategory().equals(category)) {
				resultList.add(task);
			}
		}
		
		return resultList;
	}
	
	public List<Task> listTaskByStatus(String status){
		
		List<Task> resultList = new ArrayList<>();
		for(Task task:taskList) {
			if(task.getStatus().equals(status)) {
				resultList.add(task);
			}
		}
		
		return resultList;
	}
	
	public List<Task> getAllTasks(){
		return taskList;
	}
	
}
