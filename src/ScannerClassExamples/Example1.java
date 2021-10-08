package ScannerClassExamples;

import java.util.Scanner;

public class Example1 {
	
	void display(String name) {
		System.out.println("Name is : " + name);
	}
	
	public static void main(String[] args) {
		Example1 example1 = new Example1();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your name : ");
		String line = scanner.nextLine();
		example1.display(line);
	}
}
