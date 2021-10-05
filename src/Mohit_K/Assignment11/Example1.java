package Mohit_K.Assignment11;

/*Assignment 11 : 

Write a code based on the given figure, [create 4 classes and different methods as per given figure]. from the main method, you will call the m1 method of calls A as mentioned in the figure. From m1 method call m2 method of class B and so on. 

You should write one print statement in every method like Inside First method or anything which can help you to understand which methods are being called in sequence. with acPR number please attach screenshot of output.

Please complete this assignment by Today EOD.*/

public class Example1 {
	
	void m1() {
		System.out.println("I am m1 in class Example1.");
	}
	
	static void m2() {
		System.out.println("I am m2 in class Example1.");
		
		Example2.a1();
		Example3.i1();
	}
	
	void m3() {
		System.out.println("I am m3 in class Example1.");
		m1();
	}
	
	public static void main(String[] args) {
		Example1 ex1 = new Example1();
		ex1.m3();	
		m2();
		
		Example2 ex2 = new Example2();
		ex2.a2();
		
		Example4.p1();
		Example4.p2();

	}
}
