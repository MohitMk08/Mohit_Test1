package Mohit_K.ArrayDemo.Assignment17;

import java.util.Scanner;

/*Program 2:  return a difference between sum of even number and odd numbers.	
		From given numbers, count the odd and even numbers.
		input : 10,23,26,27,88,87,65 
	    output : evenSum - oddSum
		
		int getDifference(int[] input){
		
		}*/

public class Program2 {
	
	
	void isEvenNumber(int[] numb, int arrSize) {
		int evenCount = 0;
		int oddCount = 0;
		int sumOddNo = 0;
		int sumEvenNo = 0;
		
		for(int index=0; index < arrSize; index++) {
			if(numb[index] % 2 == 0) {
				evenCount++;
				sumEvenNo =  sumEvenNo + numb[index];

			}else {
				oddCount++;
				sumOddNo = sumOddNo + numb[index];
			}
			
		}
		
		System.out.println("Even numbers in given array are :"+evenCount);
	    int oddNumCount =  arrSize - evenCount ;
	    System.out.println("\n Odd numbers in given array are :"+oddNumCount);
	    
	    int diffrence = sumEvenNo - sumOddNo;
		System.out.println("\n Diffrence in even numbers sum and odd numbers sum is : "+ diffrence);
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter size of array : ");
		int size = scanner.nextInt();
		int[] nums = new int[size];

		for(int index=0; index<nums.length; index++) {
			System.out.println("Enter number : ");
			nums[index] = scanner.nextInt();
		}
		
		Program2 pro2 = new Program2();
		pro2.isEvenNumber(nums, size);
		
	}
}
