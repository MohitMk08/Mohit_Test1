/*Assignment - 23 : 18th April'2021
3) count all the prime numbers in given range.
   input : 2 to 100
   output : */

package Mohit_K.Assignment23;

import java.util.Scanner;

public class Program3 {

	void countPrimeNoInRange(int Snum, int Enum) {
		int primeCount = 0;
		for(int index=Snum;index<=Enum;index++) {
			int counter=0; 	  
	          for(int num =index; num>=1; num--) {
	             if(index%num==0){
	            	 counter = counter + 1;
		     }
		  }
	          if (counter ==2) {
	        	  System.out.println(index);
	        	  primeCount++;
	            }
		}
		System.out.println("Prime numbers counted in the given range are: "+ primeCount);
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Start from: ");
		int start = scanner.nextInt();
		System.out.println("End to: ");
		int end = scanner.nextInt();
		Program3 pro3 = new Program3();
		pro3.countPrimeNoInRange(start, end);
	}
}
