package com.sonata;

public class TechnicalEmployee extends Employee1 
	{
		 
		TechnicalEmployee(int id, String name, String address, double pay, int leave)
		{
			super(id,name,address,pay,leave);
		}


		@Override
		public double calculateSal()
		{
			double HRA = super.BasicPay * 0.12 ;
			return HRA + super.BasicPay ;
		}
		public String toString()
		{
			return "Employee Id : "+ super.EmployeeID + "\n" + "Employee Name : " + super.EmployeeName;
		}
	}
