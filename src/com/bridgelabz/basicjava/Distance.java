package com.bridgelabz.basicjava;

import java.util.Scanner;

public class Distance {

	public static void main(String[] args) {
		int x;
		int y;
		double distance =0.0;
		Scanner scanner = new Scanner(System.in);	//user input
		System.out.println("Enter the value of x: ");
		x = scanner.nextInt();	//save user input variable
		
		System.out.println("Enter the value of y: ");
		y= scanner.nextInt();	//save user input variable
			distance = ((double)Math.pow((x * x + y * y),0.5));	//inbuilt method
			
				System.out.println("distance is :"+distance);
	}

}
