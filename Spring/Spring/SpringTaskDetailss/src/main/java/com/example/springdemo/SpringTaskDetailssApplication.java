package com.example.springdemo;

import java.sql.Connection;
import java.sql.SQLException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.springdemo.impl.TaskSystemDAOImpl;
import com.example.springdemo.model.Task;



@SpringBootApplication
public class SpringTaskDetailssApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringTaskDetailssApplication.class, args);
		TaskSystemDAO task=(TaskSystemDAO) ctx.getBean("taskSystemDAOImpl");
		Task t =  new Task();
		t.setTaskName("Junisha");
		t.setOwnerId(21251);
	
		try {
			task.addTask(t);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
