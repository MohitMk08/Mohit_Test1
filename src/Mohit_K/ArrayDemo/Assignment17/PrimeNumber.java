package Mohit_K.ArrayDemo.Assignment17;

import java.util.Scanner;

public class PrimeNumber {

	public void findPrimeNumber( int end) {

		for(int index=0;index<=end;index++) {
			int num;
			int counter=0; 	  
	        for(num =index; num>=1; num--) {
	            if(index % num == 0){
	            	 counter = counter + 1;
	            }
	        }
	        if (counter == 2) {
	        	System.out.println(index);
	        }else if(end == 0 || end == 1){
	         	System.out.println("No prime numbers in this range.");
	         	break;
	        }
	          
		}
	}

	public static void main(String[] args) {
		PrimeNumber primeNum=new PrimeNumber();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter range to : ");
		int endNum = scanner.nextInt();
		System.out.println("Prime numbers under given range are: ");
		System.out.println();
		primeNum.findPrimeNumber( endNum);
	}
	
}
