package com.example.springdemo;

import java.sql.SQLException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.springdemo.model.User;

@SpringBootApplication
public class SpringUserApplication {

	public static void main(String[] args) throws SQLException {
		ApplicationContext ctx = SpringApplication.run(SpringUserApplication.class, args);
		LoginInterface ju = (LoginInterface) ctx.getBean("loginImpl");
		User u = new User();
		u.setUsername("bhavani");
		u.setPassword("pwd");
		ju.validateUser(u, u);
		
		
	}

}
