package ScannerClassExamples;

import java.util.Scanner;

public class Example5 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any charecter : ");
		String input = sc.next();
		char ch = input.charAt(0);
		System.out.println(ch);
		
	}
}
