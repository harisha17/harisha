package com.sonata.MapExample;

import java.util.HashMap;

public class HashMapExample {

	public static void main(String[] args) {
		HashMap<String, Integer> m1 = new HashMap<String , Integer>();
		m1.put("sonata",123);
		m1.put("simple",234);
		m1.put("show",456);
		
		System.out.println("size the of map "+ m1.size());
		
		if(m1.containsKey("sonata")) {
			Integer a1 = m1.get("sonata");
			System.out.println(a1);
		}

	}

}
