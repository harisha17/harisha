package com.springmvc.etg.controller;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.springmvc.etg.UserInterface;
import com.springmvc.etg.model.TaskBean;
import com.springmvc.etg.task.TaskInterface;

@Controller
public class TaskController {
	@Autowired
	TaskInterface taskImpl;
	
	@RequestMapping("/t")
	public String task (ModelMap map) {
		return "task";
	
}
	@RequestMapping("/task")
	public String success(Model model,@RequestParam("name") String name, @RequestParam("description") String description) throws SQLException {
		TaskBean t= new TaskBean();
		t.setTaskname(name);
		t.setDescription(description);
		
		try {
			boolean flag = taskImpl.addTask(t);
			if (flag) 
				System.out.println("Sucess");
			else 
				System.out.println("unsuess");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "sucess";

	}
}
