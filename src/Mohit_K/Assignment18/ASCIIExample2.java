/*Program 2:  Write a method which will return character of given Ascii value.
Hint : Method signature should be char getAsciiOfChar(int asciiValue)*/

package Mohit_K.Assignment18;

import java.util.Scanner;

public class ASCIIExample2 {

	char GetCharOfAscii(int input) {
		char ch = (char)input;
		return ch;
		
	}
	public static void main(String[] args) {
		ASCIIExample2 ex2 = new ASCIIExample2();
		System.out.println("Enter any ASCII value : ");
		Scanner scanner = new Scanner(System.in);
		int Num = scanner.nextInt();
		char ch = ex2.GetCharOfAscii(Num);
		System.out.println(Num +" Given ASCII value is associated to : " + ch );
		
	}
}
