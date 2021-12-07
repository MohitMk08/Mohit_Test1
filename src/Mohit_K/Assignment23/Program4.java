/*Assignment - 23 : 18th April'2021
4) sum of all the prime numbers given range.
   input : 2 to 100
   output : */

package Mohit_K.Assignment23;

import java.util.Scanner;

public class Program4 {
	
	void countPrimeNoInRange(int Snum, int Enum) {
		int sum = 0;
		for(int index=Snum;index<=Enum;index++) {
			int counter=0; 	  
	          for(int num =index; num>=1; num--) {
	             if(index%num==0){
	            	 counter = counter + 1;
		     }
		  }
	          if (counter ==2) {
	        	  System.out.println(index);
	        	  sum = sum + index;
	            }
		}
		System.out.println("Sum of all prime numbers in the given range is: "+ sum);
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Start from: ");
		int start = scanner.nextInt();
		System.out.println("End to: ");
		int end = scanner.nextInt();
		Program4 pro4 = new Program4();
		pro4.countPrimeNoInRange(start, end);
	}
}
