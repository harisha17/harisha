package com.sonata;

public abstract class Employee1 {
		int EmployeeID;
		String EmployeeName;
		String Address;
		double BasicPay;
		int	Noofleaveavailable;
		Employee1(int id, String name, String address, double pay, int leave)
		{
			this.EmployeeID = id;
			this.EmployeeName = name ;
			this.Address = address;
			this.BasicPay = pay;
			this.Noofleaveavailable = leave;
		}
		
		public abstract double calculateSal();
		
		public void display() {
			System.out.println("Emp Id : "+EmployeeID);
			System.out.println("Emp Name : "+EmployeeName);
			System.out.println("Emp Address : "+Address);
			System.out.println("Emp Basic Pay : "+BasicPay);
			System.out.println("Emp No of leaves Available : "+Noofleaveavailable);
		}
		

	}
