package Mohit_K.ArrayDemo.Assignment17;

import java.util.Scanner;

/*Program 1:  From given numbers, count the odd and even numbers.
input : 10,23,26,27,88,87,65 
output : even -> 3
      odd ->  array.length - evenCount*/
      
public class Program1 {
	
	void isEvenNumber(int[] numb, int arrSize) {
		int evenCount = 0;
		for(int index=0; index < arrSize; index++) {
			if(numb[index] % 2 == 0) {
				//System.out.println(numb[index]+ " No is even");
				evenCount++;
			}
		}
		
		System.out.println("Even numbers in given array are :"+evenCount);
		System.out.println();
	    int oddNumCount =  arrSize - evenCount ;
	    System.out.println("Odd numbers in given array are :"+oddNumCount);
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
		
		Program1 pro1 = new Program1();
		pro1.isEvenNumber(nums, size);
		
	}
}
