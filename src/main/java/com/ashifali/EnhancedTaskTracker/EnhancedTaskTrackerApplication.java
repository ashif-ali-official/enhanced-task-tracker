package com.ashifali.EnhancedTaskTracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ashifali.EnhancedTaskTracker.repositories.TaskRepository;

@SpringBootApplication
public class EnhancedTaskTrackerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EnhancedTaskTrackerApplication.class, args);
	}

}
