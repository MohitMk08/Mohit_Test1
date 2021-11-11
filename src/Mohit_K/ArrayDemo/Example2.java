package Mohit_K.ArrayDemo;

public class Example2 {
	
	 void printEvenNumbers(int[] input) {
		 for(int index=0; index<input.length; index++) {
			 System.out.println(input[index]);
		 
		 }	
	 }
	
	public static void main(String[] args) {
		int[] num = {10,23,26,27,88,87,65};
		new Example2().printEvenNumbers(num);
	}

}
