package com.springcore.etg.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springcore.etg.ChristmasInterface;
import com.springcore.etg.GreetingInterface;


public class Christmas implements ChristmasInterface {
	
	GreetingInterface greeting;
	
	@Override
	public String happyChristmas(String message) {
		
		return greeting.sayGreeting(message);
		
	}

	public void setGreeting(GreetingInterface greeting) {
		this.greeting = greeting;
	}
	
	

}
