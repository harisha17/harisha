package com.springmvc.etg.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springmvc.etg.model.Task;
@RestController
public class RESTController {

	@GetMapping("/resthello")
	public String getHello() {
	return "Hello How are you";
	}

	@GetMapping("/resttask")
	public Task getTask() {
	Task task = new Task();
	task.setTaskid(1000);
	task.setTaskname("Create REST Service");
	return task;
	}

	@GetMapping("/resttasks")
	public List<Task> getTasks() {
	List<Task> list = new ArrayList<Task>();
	Task task = new Task();
	task.setTaskid(1000);
	task.setTaskname("Create REST Service");
	list.add(task);
	task.setTaskid(1001);
	task.setTaskname("Create Task Service");
	list.add(task);
	return list;
	}


}
