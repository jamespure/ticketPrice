package com.seymour.handson2;

public class TicketPrice {

	public static void main(String[] args) {
		int age = 1;
		boolean isStudent = false;
		
		if (age >= 65) {
			System.out.println("senior citizen, pay $7");
		} else if (age <= 12 && age >= 0) {
			System.out.println("child, pay $8");
		} else if (age >= 13 && age <= 64) {
			System.out.println("everyone else, pay $10");
		}else if (age < 0) {
			System.out.println("Invalid age");
		} 
		
		if (isStudent) {
			System.out.println("student, pay $8");
		} 
		
		
	}

}
