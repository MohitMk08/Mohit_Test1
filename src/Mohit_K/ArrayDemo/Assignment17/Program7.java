package Mohit_K.ArrayDemo.Assignment17;

/*Program 7:  From given array return min number.
input : 22,35,65,88,11,23,45
output : 11*/

import java.util.Scanner;

public class Program7 {

	void FindMinNum(int[] Arr) {
		int MinNum = 0;
		for(int index = 0; index < Arr.length; index++) {
			if(Arr[index] < MinNum) {
				MinNum = Arr[index];
			}
		}
		System.out.println("\n Minimum number is :"+MinNum);
		
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] Input  = new int[10];
		
		for(int index = 0; index < Input.length; index++) {
			System.out.println("Enter number : ");
			Input[index] = scan.nextInt();
		}
		
		Program7 pro7 = new Program7();
		pro7.FindMinNum(Input);
		
		
	}
}
