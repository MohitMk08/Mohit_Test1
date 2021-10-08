package ScannerClassExamples;

import java.util.Scanner;

public class Example2 {
	
	void display(String name, int number) {
		for (int index=0; index <=number; index++) {
				System.out.println("Name is : " + name);
		}
	}
	
	public static void main(String[] args) {
		Example2 example2 = new Example2();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your name : ");
		String line = scanner.nextLine();
		System.out.println("Enter count : ");
		String inputNumber = scanner.nextLine();
		int number = Integer.parseInt(inputNumber);
		example2.display(line, number);
	}
}

