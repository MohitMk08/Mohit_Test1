/*Assignment - 23 : 18th April'2021
2) print all the prime numbers given range.
   input : 40 to 100
   output : */
package Mohit_K.Assignment23;

import java.util.Scanner;

public class Program2 {

	public void findPrimeNumber(int start , int end) {

		for(int index=start;index<=end;index++) {
			int counter=0; 	  
	          for(int num =index; num>=1; num--) {
	             if(index%num==0){
	            	 counter = counter + 1;
		     }
		  }
	          if (counter ==2) {
	        	  System.out.println(index);
	            }
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter starting range:");
		int start = scanner.nextInt();
		System.out.println("Enter ending range:");
		int end = scanner.nextInt();
		Program2 pro2=new Program2();
		pro2.findPrimeNumber(start, end);
	}
}
