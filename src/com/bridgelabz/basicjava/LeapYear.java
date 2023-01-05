package com.bridgelabz.basicjava;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter any year");
		Scanner scanner = new Scanner(System.in); //create object
		
		//take integer variable year and assign value to the variable
		
		int year = scanner.nextInt();
		
		/*
		 * Check if the year is divisible by 400
		 * check if the year is divisible by 4 but not 100
		 * Display Leap Year Otherwise Not Leap Year
		 */
		
		if(year % 400 == 0 && year % 100 == 0 || year % 100 != 0 && year % 4 ==0)
			System.out.println("Leap Year");
		else
			System.out.println("Not a leap year");
		

	}

}
