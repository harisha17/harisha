package com.springcore.etg.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springcore.etg.CalculatorInterface;
import com.springcore.etg.UserInterface;
@Component
public class Calc implements UserInterface {
	@Autowired
	CalculatorInterface Calculator;

	@Override
	public int userexpression() {
		// TODO Auto-generated method stub
		return (Calculator.add(10,20)+Calculator.subtract(40, 20));
	}

}
