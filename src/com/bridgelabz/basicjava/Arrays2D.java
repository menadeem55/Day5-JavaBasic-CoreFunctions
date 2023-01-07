package com.bridgelabz.basicjava;

import java.util.Scanner;

public class Arrays2D {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); // create an object
		System.out.println("Enter the value of Rwos:");
		int rows = scanner.nextInt();

		System.out.println("Enter the value of columns:");
		int column = scanner.nextInt();

		/*
		 * An integer array array -> name of two dimensional array create a 2d array
		 * using new. Initialization
		 */
		int arr[][] = new int[rows][column];
		System.out.println("Please provide values for the array");

		/*
		 * i -> row number j -> column number
		 */
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < column; j++) {
				arr[i][j] = scanner.nextInt();
			}
		}

		System.out.println("Lets print all values : ");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < column; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
