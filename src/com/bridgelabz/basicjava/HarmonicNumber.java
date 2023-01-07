package com.bridgelabz.basicjava;

import java.util.Scanner;

public class HarmonicNumber {
	
	/*
	 * Harmonic numbers are related to the harmonic mean in that the n-th harmonic number 
	 * is also n times the reciprocal of the harmonic mean of the first n positive integers.
	 * Hn = 1 + 1/2 + 1/3 + ... + 1/n
	 */

	public static void main(String[] args) {
		System.out.println("Enter the Number - ");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		double result = 0.00;
		

		/*
		 * using for loop calculating Harmonic value i-- decrement number
		 */

		for(int i=num; i>0 ; i--) {
			result = result + (double) 1/ num;
			System.out.println(result + " ");
		}

	}

}
