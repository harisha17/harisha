package com.springmvc.etg.controller;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.springmvc.etg.AddInterface;
import com.springmvc.etg.UserInterface;
import com.springmvc.etg.model.Task;

@Controller
public class HelloConroller {
	@Autowired
	UserInterface userImpl;
	//handler method
	@RequestMapping("/sayhello")
	public String sayHello(Model model) {
		model.addAttribute("msg", "Hi How are you");
		return "hello";
	}
	
	@RequestMapping("/gettask")
	public String getTask(Model model) {
		Task task = new Task();
		task.setTaskid(1000);
		task.setTaskname("Create a controller");
		model.addAttribute("task", task);
		return "task";
	}
	//@RequestMapping("/")
	//public String sayHello1(ModelMap map) {
	//	return "addform";
	//}
	
	@RequestMapping("/mav")
	public ModelAndView sayHello2() {
		ModelAndView m = new ModelAndView("home");
		m.addObject("name", "Example of ModelAndView");
		return m;
	}
	
	//@RequestMapping("/home")
	//public void sayHello3(Model model,@RequestParam("no1") int no1, @RequestParam("no2") int no2) {
		//int r = add.add(no1, no2);
		//model.addAttribute("name", r);
	//}

	@RequestMapping("/")
	public String logins(ModelMap map) {
		return "login";
	}
	
	
	@RequestMapping("/login")
	public String login(Model model,@RequestParam("username") String name, @RequestParam("pwd") String password) throws SQLException {
		boolean a = userImpl.validateuser(name,password);
		if(a==true) {
			
			System.out.println("valid user");
			return "sucess";
		}
		else
		{
			model.addAttribute( "username","not valid user");
			
			return "login";
		}
		
	}
	
}
