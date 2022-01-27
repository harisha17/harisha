package com.sonata.CollectionExample;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class SimpleCollection {
	public static void main(String args[]) {
		//Employee e1 =new Employee();
		
      List<String> l1 =new ArrayList<String>();//<> Ge
      l1.add("Simple");      
      l1.add("Next");
      l1.add("show");
      l1.add("Shailaja");
      //int a=10;
      //l1.add(a);
      
     
      System.out.println(l1);   
      
      for (Object name : l1) {
    	System.out.println(name);  
      }
      
     Collection<Integer> s1 = new ArrayList<>();
     s1.add(12);
     s1.add(34);
     s1.add(56);
     
     for(Integer n1 : s1) {
    	 System.out.println(n1);
     }
	}
  
}
