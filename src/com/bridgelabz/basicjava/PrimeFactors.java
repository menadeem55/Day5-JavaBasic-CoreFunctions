package com.bridgelabz.basicjava;

import java.util.Scanner;

public class PrimeFactors {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = scanner.nextInt();
		System.out.println("Prime factors for the given numbers are :");

		for (int i = 2; i <= number; i++) {

			while (number % i == 0) {
				System.out.println(i + "");
				number = number / i;
			}
		}
	}
}