package Mohit_K.Assignment10;
/*Assignment-10 : 3rd April'2021

Java Assignment-10 : 3rd April 2021
Write a class called calculator with following functionality.
a. add
b. subtraction
c. division
d. multiplication
e. printTotalAnswer.

Method a,b,c,d should have 2 parameters and return int value.
printTotalAnswer method should have 4 parameters and doesnt return anything.
Note : do not create any instance variable.*/

public class NewCalculator {
	
	int add(int num1, int num2) {
		return num1 + num2;
	}
	
	int sub(int num1, int num2) {
		return num1 - num2;
	}
	int mul(int num1, int num2) {
		return num1 * num2;
	}
	
	int div(int num1, int num2) {
		return num1 / num2;
	}
	
	void totalAns(int totaladd, int totalasub, int totalamul, int totaladiv) {
		int Sum = totaladd + totalasub + totalamul + totaladiv;
		System.out.println("Sum of all methods is : "+ Sum);
	}
	
	public static void main(String[] args) {
		NewCalculator new1 = new NewCalculator();
		int totaladd = new1.add(10, 10); //20
		int totalasub = new1.sub(35, 5); //30
		int totalamul = new1.mul(4, 7); //28
		int totaladiv = new1.div(90, 6); //15
		new1.totalAns(totaladd, totalasub, totalamul, totaladiv);
	}
	
}
