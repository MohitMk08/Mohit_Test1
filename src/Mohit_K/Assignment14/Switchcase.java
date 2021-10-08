package Mohit_K.Assignment14;

import java.util.Scanner;

public class Switchcase {
	
	void vowelCheckUsingSwitch(char inputChar) {
		switch(inputChar) {
		case 'A':
		case 'a':
			System.out.println(inputChar + " is a vowel");
			break;
		case 'e':
		case 'E':
			System.out.println(inputChar + " is a vowel");
			break;
		case 'i':
		case 'I':
			System.out.println(inputChar + " is a vowel");
			break;
		case 'o':
		case 'O':
			System.out.println(inputChar + " is a vowel");
			break;
		case 'u':
		case 'U':
			System.out.println(inputChar + " is a vowel");
			break;
		default:
			System.out.println(inputChar + " is NOT a vowel");
			break;
		}
	}

	public static void main(String[] args) {
		Switchcase  scase = new Switchcase();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any charecter : ");
		String input = scan.next();
		char chracter = input.charAt(0);
		scase.vowelCheckUsingSwitch(chracter);
	}
}
