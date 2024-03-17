package com.ashifali.EnhancedTaskTracker.entities;

import java.util.Date;

public class Task {

	private int id;
	private String description;
	private Date dueDate;
	private String priority;
	private String category;
	private String status;
	private int dependsOn;
	
	public Task(int id, String description, Date dueDate, String priority, String category, String status, int dependsOn) {
		this.id=id;
		this.description=description;
		this.dueDate=dueDate;
		this.priority=priority;
		this.category=category;
		this.status=status;
		this.dependsOn=dependsOn;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getDependsOn() {
		return dependsOn;
	}

	public void setDependsOn(int dependsOn) {
		this.dependsOn = dependsOn;
	}
		
}
