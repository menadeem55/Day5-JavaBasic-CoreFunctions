package com.bridgelabz.basicjava;

import java.util.Scanner;

public class QuotientAndRemainder {
	// Java Program to Compute Quotient and Remainder

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // scanner input
		// taking dividend and divisor as user input using scanner class

		System.out.println("enter divident : ");
		int divident = scanner.nextInt(); // storing dividend value

		System.out.println("enter divisor : ");
		int divisor = scanner.nextInt(); // storing divisor value

		int quotient = divident / divisor; // / this give value for quotient
		int remainder = divident % divisor; // % this will give value for reminder

		System.out.println("Quotient is : " + quotient);
		System.out.println("Remainder is : " + remainder);

		scanner.close();

	}

}
