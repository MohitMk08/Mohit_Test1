package Mohit_K.ArrayDemo.Assignment17;

import java.util.Scanner;

/*Program 6:  From given array return max number.
input : 22,35,65,88,11,23,45
output : 88*/

public class Program6 {
	
	void FindMaxNum(int[] Arr) {
		int MaxNum = 0;
		for(int index = 0; index < Arr.length; index++) {
			if(Arr[index] > MaxNum) {
				MaxNum = Arr[index];
			}
		}
		System.out.println("\n Maximum number is :"+MaxNum);
		
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] Input  = new int[10];
		
		for(int index = 0; index < Input.length; index++) {
			System.out.println("Enter number : ");
			Input[index] = scan.nextInt();
		}
		
		Program6 pro6 = new Program6();
		pro6.FindMaxNum(Input);
		
		
	}
}
