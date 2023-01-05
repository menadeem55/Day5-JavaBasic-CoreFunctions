package com.bridgelabz.basicjava;

import java.util.Scanner;

public class CheckEvenOdd {
	public static void main(String[] args) {
		
		//Java Program to Check Whether a Number is Even or Odd
		
		Scanner scanner = new Scanner(System.in);	// scanner input
		System.out.println("Enter a Number: ");
		int number = scanner.nextInt();
		EvenOdd(number);
	}

	static void EvenOdd(int number) {
		if (number % 2 == 0)	// if number is divisble by 2
			System.out.println("Even Number: " + number);
		else
			System.out.println("Odd Number: " + number);
	}

}
