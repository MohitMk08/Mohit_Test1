/*Assignment 18 : 14th April'2021
Program 1:  Write a method which will return ascii value of given character.
Hint : Method signature should be int getAsciiOfChar(char ch)
*/

package Mohit_K.Assignment18;

import java.util.Scanner;

public class AsciiExample1 {
	
	int getAsciiOfChar(String input) {

		char ch = input.charAt(0);
		int ascii = (int) ch;
		return ascii;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any character : ");
		String cha1 = scanner.next();
		AsciiExample1 ex1 = new AsciiExample1();
		int value = ex1.getAsciiOfChar(cha1);
		System.out.println("ASCII value of given character is : "+ value+"\n");
		
	}
}
