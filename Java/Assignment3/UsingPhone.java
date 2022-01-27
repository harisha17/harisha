package com.sonata;

public class UsingPhone {
public static void main(String[] args) {
TechnicalEmployee T = new TechnicalEmployee(21261, "Harisha", "Machilipatnam", 26000, 10);
		   Staff S = new Staff(21261, "Harisha", "Machilipatnam", 360000, 6);
			T.display();
			System.out.println("Technical Employee Sal is : "+T.calculateSal());
			System.out.println("\n");
			S.display();
			System.out.println("Staff Sal is : "+S.calculateSal());
			
		}


	}
