package com.springmvc.etg.controller;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springmvc.etg.model.Task;
import com.springmvc.etg.model.TaskBean;
import com.springmvc.etg.model.UserBean;
import com.springmvc.etg.task.TaskInterface;

@RestController
	public class TaskRestController {
	@Autowired
	TaskInterface taskImpl;
	
//	@PostMapping("/restgettask")
//	public void addTask (@RequestBody TaskBean task) throws SQLException{
//	taskImpl.addTask(task);
//	}


	@GetMapping("/restgettask/{taskid}")
	public TaskBean getTask(@PathVariable int taskid) throws SQLException{
	return taskImpl.getTask(taskid);
	}
	@GetMapping("/updateownerid/{taskid}/{ownerid}")
	public void updateOwnerid(@PathVariable int taskid, @PathVariable int ownerid) {
	taskImpl.assignOwner(taskid, ownerid);
	}
	
	@PostMapping("/restgettask")
	public ResponseEntity<TaskBean>addTask(@RequestBody TaskBean task)throws SQLException
	{
	taskImpl.addTask(task);
	return new ResponseEntity<TaskBean>(task,HttpStatus.OK) ;
	}

	@GetMapping("/getalltask/{status}")
	public TaskBean getallTask(@PathVariable String status) throws SQLException{
	return taskImpl.getTask(status);
	}
	
	

	@GetMapping("/assignpriority/{taskid}/{priority}")
	public int assignpriority(@PathVariable int taskid,@PathVariable int priority ) throws SQLException
	{
	return taskImpl.assignpriority(taskid,priority);
	}
	
	@PutMapping("/setNote/{taskid}/{notes}")
	public void setNote(@PathVariable int taskid, @PathVariable String notes ) {
	taskImpl.setNote(taskid, notes);
	}
	@PostMapping("/restadduser")
	public void addUser(@RequestBody UserBean user)throws SQLException
	{
	taskImpl.addUser(user);
	}
	
	@GetMapping("/restgetAlltask/{ownerid}")
	public List<TaskBean> getAllTask(@PathVariable int ownerid) throws SQLException {

		return (java.util.List<TaskBean>) taskImpl.getallTask(ownerid);
	}
	
	}
	
