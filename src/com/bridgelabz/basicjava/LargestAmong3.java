package com.bridgelabz.basicjava;

import java.util.Scanner;

public class LargestAmong3 {
	// Java Program to Find the Largest Among Three Numbers

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // scanner input
		System.out.println("Enter first number : ");
		int number1 = scanner.nextInt(); // storing 1st input
		System.out.println("Enter second number : ");
		int number2 = scanner.nextInt(); // storing 2nd input
		System.out.println("Enter third number : ");
		int number3 = scanner.nextInt(); // Storing 3rd input

		// Comparing all 3 numbers
		if (number1 > number2 && number1 > number3)
			System.out.println("Largest number is number one i.e :" + number1);
		else if (number2 > number1 && number2 > number3)
			System.out.println("Largest number is number two i.e :" + number2);
		else
			System.out.println("Largest number is number three i.e :" + number3);

		scanner.close();
	}

}