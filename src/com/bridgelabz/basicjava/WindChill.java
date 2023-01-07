package com.bridgelabz.basicjava;

import java.util.Scanner;

public class WindChill {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in); // create an object
		System.out.println("Enter Temperature in Fahrenheit: ");
		double t = scanner.nextDouble(); // temperature (F)
		System.out.println("Enter Wind Speed In miles Per Hour: ");
		double v = scanner.nextDouble(); // velocity of wind
		if (Math.abs(t) > 50 || v > 120 || v < 3) {
			System.out.println("enter correct input");
		} else {
			System.out.println(" ");

			/*
			 * It should print the wind chill w using the following formula careful to add
			 * all three * signs:
			 */
			double w = 35.74 + 0.62158 * t + (0.4275 * t - 35.75) * Math.pow(v, 0.16); // Use Math.pow to compute the
																						// exponent
			System.out.println("Wind Chill : " + w); // print the result
		}

	}

}