package com.sonata.MapExample;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExampleIter {

	public static void main(String[] args) {
		HashMap <Integer, String> m2 = new HashMap<Integer , String>();
		m2.put(123,"Sonata");
		m2.put(234,"show");
		m2.put(456,"simple");
       System.out.println(m2);
		Set s = m2.entrySet();
		
		Iterator i1 = s.iterator();
		while(i1.hasNext()) {
			Map.Entry m = (Map.Entry)i1.next();
			System.out.println(m.getKey());
			System.out.println(m.getValue());
		}
		

	}

}
