package com.sonata;

public class RectangleArea extends Shape 
	{
		
		public double rectangle(double length, double width) 
		{
			return length * width;
		}

		public static void main(String[] args)
		{
			
			RectangleArea  ar = new RectangleArea ();
			System.out.println("Area of Rectangle : "+ar.rectangle(3.5, 2.5));
			
		}

	}
