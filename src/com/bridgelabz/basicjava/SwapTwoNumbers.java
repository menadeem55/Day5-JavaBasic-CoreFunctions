package com.bridgelabz.basicjava;

import java.util.Scanner;

public class SwapTwoNumbers {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 2 Numbers: ");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		int swap;
		System.out.println("Before Swapping: "+num1+" & "+num2);
		swap = num1;
		num1 = num2;
		num2 = swap;
		System.out.println("After Swapping: "+num1+" & "+num2);
	}

}