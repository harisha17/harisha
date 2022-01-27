package com.sonata;

public class MyOwnAutoShop {
		public static void main(String args[])
		{
			Car c1 = new Car(500,150000,"Pink");
			Sedan s1 = new Sedan(400,50000,"Blue",30);
			Ford f1 = new Ford(250,80000,"Black",2018,7);
			Ford f2 = new Ford(200,70000,"White",2021,3);
			System.out.println("Car");
			c1.display();
			System.out.println("Sale Price of Car:"+c1.getSalePrice());
			System.out.println("Sedan");
			s1.display();
			System.out.println(s1.length);
			System.out.println("Sale Price of Sedan:"+s1.getSalePrice());
			System.out.println("Ford 1");
			f1.display();
			System.out.println(f1.year);
			System.out.println(f1.manufacturerDiscount);
			System.out.println("Sale Price of ford1:"+f1.getSalePrice());
			System.out.println("Ford 2");
			f2.display();
			System.out.println(f2.year);
			System.out.println(f2.manufacturerDiscount);
			System.out.println("Sale Price of ford2:"+f2.getSalePrice());
		}


	}
