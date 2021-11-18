/*2) WAP to sum all the numbers in given string.
Input: J7yu9y8h1h8j4b7j3jjb6
Ouput: Sum of all digits in String is: 53*/

package Mohit_K.Assignment20;

import java.util.Scanner;

public class Program2 {

	void sumOfDigits(String str) {
		int sum = 0;
		for(int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if(Character.isDigit(ch)) {
				sum = sum + Character.getNumericValue(ch);
				
			}
		}
		System.out.println("Sum of all digits in the given string is : "+sum);
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter something :");
		String input = scanner.next();
		
		Program2 pro2 = new Program2();
		pro2.sumOfDigits(input);
	}
}
