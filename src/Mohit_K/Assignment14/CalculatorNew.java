package Mohit_K.Assignment14;

import java.util.Scanner;

public class CalculatorNew {
	

		int add(int num1, int num2) {
			System.out.println("Sum is : "+ (num1 + num2));
			return num1 + num2;
		}

		int sub(int num1, int num2) {
			System.out.println("Minus is : " + (num1 - num2));
			return num1 - num2;
		}
		int mul(int num1, int num2) {
			System.out.println("Multiplication is : " + (num1 * num2));
			return num1 * num2;
		}

		int div(int num1, int num2) {
			System.out.println("Division is : " + (num1 / num2));
			return num1 / num2;
		}

		void totalAns(int totaladd, int totalasub, int totalamul, int totaladiv) {
			int Sum = totaladd + totalasub + totalamul + totaladiv;
			System.out.println("Sum of all methods is : "+ Sum);
		}

		public static void main(String[] args) {
			CalculatorNew new1 = new CalculatorNew();
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter no. 1 : ");
			int numb1 = scanner.nextInt();
			System.out.println("Enter no. 2 : ");
			int numb2 = scanner.nextInt();

			int totaladd = new1.add(numb1, numb2); 
			int totalasub = new1.sub(numb1, numb2); 
			int totalamul = new1.mul(numb1, numb2); 
			int totaladiv = new1.div(numb1, numb2); 
			new1.totalAns(totaladd, totalasub, totalamul, totaladiv);
		}

	}

