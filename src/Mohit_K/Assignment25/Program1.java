/*Assignment - 25 : 18th April'2021

Program 1:  Write a method which will return first 5 prime numbers from given range. 
Main method should print the output.
Input : Start Index -> 10
        End Index -> 50
Output : 11 13 17 19 23
*/

package Mohit_K.Assignment25;

import java.util.Scanner;

public class Program1 {

	int[] findPrimeNo(int start, int end) {
		int[] allPrimeNum = new int[end/2];
		int count = 0;
		System.out.println("Prime numbers in the given range is as follows :");
		for(int index=start; index<=end; index++) {
			int targetNum = index;
			boolean flag = true;
			for(int num=2; num<= targetNum/2; num++) {
				if(targetNum % num == 0) {
					flag = false;
					break;
				}
			}
			if(flag) {
				System.out.println(targetNum);
				allPrimeNum[count] = targetNum;
				count++;
			}		
		}
		//System.out.println("count is : "+count);
		return allPrimeNum;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter start num : ");
		int StartOfRange = scanner.nextInt();
		System.out.println("Enter end num : ");
		int EndOfRange = scanner.nextInt();
		
		Program1 pro1 = new Program1();
		int[] first5 = pro1.findPrimeNo(StartOfRange, EndOfRange);
		
		System.out.println("first 5 prime numbers in the given range is as follows : ");
		for(int index=0; index<5; index++) {
			System.out.println(first5[index]);
		}
	}
}
