package com.springcore.etg;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.etg.impl.Greeting;

@SpringBootApplication
public class SpringcoreApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringcoreApplication.class, args);
		
		BeanFactory factory = new ClassPathXmlApplicationContext("beans.xml");
		//GreetingInterface greet = new Greeting();
		ChristmasInterface greet = (ChristmasInterface) factory.getBean("xmas");
		System.out.println(greet);
		ChristmasInterface greet1 = (ChristmasInterface) factory.getBean("xmas");
		System.out.println(greet1);
		ChristmasInterface greet2 = (ChristmasInterface) factory.getBean("xmas");
		System.out.println(greet2);
		System.out.println(greet.happyChristmas("Sonata"));
	}
	
	

}
