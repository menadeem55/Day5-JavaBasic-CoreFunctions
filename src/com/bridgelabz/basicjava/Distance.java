package com.bridgelabz.basicjava;

import java.util.Scanner;

public class Distance {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // scanner input
		System.out.println("Enter the value of x");
		int x = scanner.nextInt();
		System.out.println("Enter the value of y");
		int y = scanner.nextInt();

		double distance = Math.sqrt(x * x + y * y); // formula for distance
		System.out.println("Euclidean distance : " + distance);

	}

}
