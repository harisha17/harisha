package com.springcore.etg.impl;

import com.springcore.etg.CalculatorInterface;
import org.springframework.stereotype.Component;


@Component
public class Calculator implements CalculatorInterface {
	
	
	@Override
	public int add(int a, int b) {
	   return a + b;
	   
	   
	}
	@Override
	public int subtract(int a, int b) {
	   return a -b;
	   
	   
	}

}
