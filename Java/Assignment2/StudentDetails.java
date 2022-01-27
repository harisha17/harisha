package com.sonata;

public class StudentDetails {
	int stdId;
	String stdName;
	int stdClass;
	StudentDetails(int a,String b,int c){
		this.stdId=a;
		this.stdName=b;
		this.stdClass=c;
	}
	public void display() {
		System.out.println(stdId);
		System.out.println(stdName);
		System.out.println(stdClass);	
	}
	public static void main(String args[]) {
		StudentDetails s1=new StudentDetails(012,"Harisha",9);
		s1.display();
		StudentDetails s2=new StudentDetails(013,"Ashok",10);
		s2.display();
	}

}
