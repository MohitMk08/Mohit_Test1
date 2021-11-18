/*Assignment 19:  14th April'2021
Program 1: Write a method which will return "Techno" if Uppercase character count is higher then LowerCase character count, otherwise return "Credits". Print output in main method.

input : TeCHnoSessionS
output : Credits*/

package Mohit_K.Assignment19;

import java.util.Scanner;

public class Program1 {
	
	String method1(String str) {
		int CountupperCase = 0;
		int CountLowerCase = 0;
				
		for(int index = 0; index < str.length(); index++ ) {
				
			if (Character.isUpperCase(str.charAt(index))) {
				CountupperCase++;
			}else {
				CountLowerCase++;
			}
		}
		
		if(CountupperCase > CountLowerCase) {
			System.out.println("Techno");
			return "Techno";
		}else if(CountupperCase == CountLowerCase) {
			System.out.println("bothEqual");
			return "bothEqual";
		}else {
			System.out.println("Credits");
			return "Credits";
		}
	}
	
	

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any string value : ");
		String input = scanner.next();
		Program1 program1 =  new Program1();
		program1.method1(input);
	}
}
