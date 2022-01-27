package com.sonata.GenricsExample;

import java.util.ArrayList;

public class TestGen {

	//Genrics with method
	public static < E > void simpleArray(E[] elements) {  
        for ( E element : elements){          
            System.out.println(element );  
         }  
         System.out.println();  
    }  
	
	public static void main(String[] args) {
	
		EmpGn<Integer> gm = new EmpGn<Integer>();
		gm.add(12);
	
	
		EmpGn<String> gm1 = new EmpGn<String>();
		
		
		System.out.println(gm.get());
		
		Integer[] a1 = {10,20,30,40};
		simpleArray(a1);

		
		
		/*ArrayList l12 = new ArrayList();
		int a =12;
		l12.add("abc");
		l12.add(a);
		System.out.println(l12);*/
	}

}
