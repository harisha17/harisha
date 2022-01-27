package com.sonata;

public class SquareArea {

		public double square(double length)
		{
			return length * length;
		}

		public static void main(String[] args)
		{
			
			SquareArea ar = new SquareArea();
			System.out.println("Area of square : "+ar.square(3));
			
		}

}
