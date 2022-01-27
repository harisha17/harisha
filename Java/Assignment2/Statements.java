package com.sonata;

public class Statements {
public static void main(String args[]) {
	int grade=68;
	if(grade > 60) {
		System.out.println("Congratulations!");
		System.out.println("You passed!");
	}
	else if((grade<60) && (grade>=50)) {
		System.out.println("Good job!");
		
	}
	else if((grade<50) && (grade>=40)) {
		System.out.println("Study harder!");
	}
	else {
		System.out.println("Sorry you failed");
		
		
	}
}


}
