package Mohit_K.Assignment11;

/*Assignment 11 : 

Write a code based on the given figure, [create 4 classes and different methods as per given figure]. from the main method, you will call the m1 method of calls A as mentioned in the figure. From m1 method call m2 method of class B and so on. 

You should write one print statement in every method like Inside First method or anything which can help you to understand which methods are being called in sequence. with acPR number please attach screenshot of output.

Please complete this assignment by Today EOD.*/

public class Example2 {

    static void a1() {
    	System.out.println("I am a1 in class Example2.");
	}
	
	void a2() {
		System.out.println("I am a2 in class Example2.");
		/*Example3 ex3 = new Example3();
		ex3.i2();*/
			
	}
	
	static void a3() {
		System.out.println("I am in a3 class Example2.");
		a1();
		
		//Example3.i1();	
	}
	
}
