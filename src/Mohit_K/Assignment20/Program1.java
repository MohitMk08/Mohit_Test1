/*Assignment 20:  14th April'2021

1) Count Digits,Letters, UpperCase characters, LowerCase characters, Special characters from predefined string.

Input: 1rRpd3F9#K(E
Output : 
Total digit: 3
Total Letters: 7
Total Uppercase: 4
Total Lowercase: 3
Total Special char: 2

*/

package Mohit_K.Assignment20;

import java.util.Scanner;

public class Program1 {
	int UpperCase = 0;
	int LowerCase = 0;
	int Digit = 0;
	int SpecialCharacter = 0;
	
	void stringIdentity(String str) {
		for(int index=0; index<str.length(); index++) {
			
			if(Character.isUpperCase(str.charAt(index))) {
				UpperCase++;
			}else if(Character.isLowerCase(str.charAt(index))) {
				LowerCase++;
			}else if(Character.isDigit(str.charAt(index))) {
				Digit++;
			}else {
				SpecialCharacter++;
			}
		}
	}
	
	void display() {
		System.out.println("Total Uppercase characters in given string is: "+UpperCase);
		System.out.println("\n Total Lowercase characters in given string is: "+LowerCase);
		System.out.println("\n Total Digits in given string is: "+Digit);
		System.out.println("\n Total Special characters in given string is: "+SpecialCharacter);
	}
	

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter something : ");
		String input = scanner.next();
		
		Program1 pr1 = new Program1();
		pr1.stringIdentity(input);
		pr1.display();
		
	}
}
