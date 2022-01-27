package com.sonata.CompletEmp;

public class TestEmployeeCollection {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.setEmpId(123);
		e1.setEmpName("Shailaja");
		e1.setEmpSal(23456);
		
		Employee e2 = new Employee();
		e2.setEmpId(123);
		e2.setEmpName("Shailaja");
		e2.setEmpSal(23456);
		
		EmployeeImpl l1 = new EmployeeImpl();
		l1.addEmployee(e1);
		l1.addEmployee(e2);
		System.out.println(l1.getEmployee());
		System.out.println(l1);
	}

}
