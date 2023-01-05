package com.bridgelabz.basicjava;

import java.util.Scanner;

public class VowelorConsonant {

	public static void main(String[] args) {

		// Java Program to Check Whether an Alphabet is Vowel or Consonant

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter character To See Vowel Or Consonent:~ ");
		char character = scanner.next().charAt(0); // storing char value

		switch (character) { // Switch statement

		// case statement within the switch block
		case 'A':
			System.out.println("A is Vowel");
			break;
		case 'E':
			System.out.println("E is Vowel");
			break;
		case 'I':
			System.out.println("I is Vowel");
			break;
		case 'O':
			System.out.println("O is Vowel");
			break;
		case 'U':
			System.out.println("U is Vowel");
			break;
		default: // Default case statement
			System.out.println("This is Consonent: ");
		}
		scanner.close();
	}

}
