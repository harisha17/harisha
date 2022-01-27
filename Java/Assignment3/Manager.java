package com.sonata;

public class Manager extends Employee 
	{
		public Manager(int id, String name, double sal, String a) {
			super(id,name,sal,a);		
		}
		public void salCal() {
			System.out.println("Employee Class");
		}
	}
