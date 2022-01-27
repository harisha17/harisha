package com.sonata.CollectionExample;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class MyExample {

	public static void main(String[] args) {
		ArrayList l1 = new ArrayList();
		l1.add("abc");
		l1.add("abc");
		l1.add("show");
		
		System.out.println(l1);
		
		LinkedList l2 =new LinkedList(l1);
		l2.addFirst("os");
		l2.addLast("show");
		System.out.println(l2);
		l2.removeLast();
		System.out.println(l2);
		
		HashSet h1 = new HashSet(l2);
		h1.add("os");
		System.out.println(h1);
		
		TreeSet t1 = new TreeSet(h1);
		t1.add("msd");
		System.out.println(t1);
		}
}
