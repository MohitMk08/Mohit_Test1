/*Assignment - 23 : 18th April'2021
5) Average of all the prime numbers given range.
   input : 2 to 100
   output : */

package Mohit_K.Assignment23;

import java.util.Scanner;

public class Program5 {

	void countPrimeNoInRange(int Snum, int Enum) {
		int count = 0;
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
	        	  count++;
	        	  sum = sum + index;	  
	          }
		}
		float average = (sum/count);
		System.out.println("Sum of all prime numbers in the given range is: "+ sum);
		System.out.println("Total prime numbers in the given range is: "+ count);
		System.out.println("Average of all prime numbers in the given range is: "+ average);
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Start from: ");
		int start = scanner.nextInt();
		System.out.println("End to: ");
		int end = scanner.nextInt();
		Program5 pro5 = new Program5();
		pro5.countPrimeNoInRange(start, end);
	}
}
