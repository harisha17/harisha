package com.sonata.SerializationExample;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class EmployeeSerializ {

	public static void main(String[] args)throws IOException {
		
		Employee obj =new Employee(123, "Shailaja","Vijayanagar");
		ObjectOutputStream oos =null;
		FileOutputStream fos=null;
		 Employee ob =null;
		//Serialized the object and created a file with that.
		 try {
		 fos = new FileOutputStream("D:\\Employee.ser"); 
		 
		 oos = new ObjectOutputStream(fos);
	      oos.writeObject(obj);
	      
		 }
		 finally {
	    	 oos.close();
	    	 fos.close();
	     }
	    
	      
	      System.out.println("Serialzation Done!!");
	     
		//Deserialized the employee object
	      FileInputStream fis = new FileInputStream("D:\\Employee.ser");
	      ObjectInputStream ois = new ObjectInputStream(fis);
	      try {
	      ob = (Employee)ois.readObject();
	      ois.close();
	      fis.close();
	      }catch(ClassNotFoundException s) {System.out.println(s);}
	      System.out.println("Employee ID is " + ob.getEmpId());
	      System.out.println("Employee Add is" + ob.getEmpAdd());
	}

}

















