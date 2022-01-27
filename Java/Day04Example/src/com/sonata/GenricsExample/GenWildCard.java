package com.sonata.GenricsExample;

import java.util.ArrayList;
import java.util.List;

abstract class car{
	abstract void engine();
}

 class Maruthi extends car{
	 void engine() {System.out.println("Maruthi Engine");}
 }
 class Renalt extends car{
	 void engine() {System.out.println("Duster Engine");}
 }
 
public class GenWildCard {
   public static void carShape(List<? extends car>list) {
	 for(car c : list) {
		 c.engine();
	 }  
   }
	public static void main(String[] args) {
		List<Maruthi> l1 = new ArrayList<>();
		l1.add(new Maruthi());
		
		List<Renalt> l2 = new ArrayList<>();
		l2.add(new Renalt());
		l2.add(new Renalt());
		
		carShape(l1);
		carShape(l2);

	}

}
