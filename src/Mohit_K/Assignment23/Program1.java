/*Assignment - 23 : 18th April'2021

Write a program with different method to satisfy following requirement. 
1) validate whether given number is prime or not.
 */

package Mohit_K.Assignment23;

import java.util.Scanner;

public class Program1 {

	Boolean validatePrimeNumber(int input) {
		Boolean state = null;
		for(int index=2; index<input; index++) {
			if(input % 2 == 0) 
				state = false;
			else
				state = true;
		}
		return state;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any number : ");
		int num = scanner.nextInt();
		Program1 pro1 = new Program1();
		Boolean state = pro1.validatePrimeNumber(num);
		
		if(state == true) 
			System.out.println("Given number "+num+" is a prime number.");
		else
			System.out.println("Given number "+num+" is not a prime number.");
		
	}
}
