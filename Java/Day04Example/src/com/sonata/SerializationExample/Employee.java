package com.sonata.SerializationExample;

public class Employee implements java.io.Serializable {
	private int empId;
	private String empName;
	private transient String empAdd;
	private static double empSal;
	
	public Employee(int empId, String empName, String empAdd) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empAdd = empAdd;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpAdd() {
		return empAdd;
	}

	public void setEmpAdd(String empAdd) {
		this.empAdd = empAdd;
	}

	public static double getEmpSal() {
		return empSal;
	}

	public static void setEmpSal(double empSal) {
		Employee.empSal = empSal;
	}
	
	
	

}
