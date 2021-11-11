package Mohit_K.ArrayDemo.Assignment17;

import java.util.Scanner;

import javax.jws.soap.SOAPBinding;
import javax.swing.plaf.synth.SynthOptionPaneUI;

/*Program 5:  return true if you find a target number from given array else return false.
input : 10,23,23,44,23,10,23,4,23
target number : 45
output : Number 45 doesnt found in given array.

boolean isNumberPresent(int[] arr,int target){
	if(arr[index] == target)
		
}  */

public class Program5 {
	
	boolean findTargetNum(int[] numbrs, int target){
		
		for(int index = 0; index <numbrs.length; index++) {
			if(numbrs[index] == target) {
				//System.out.println(target + "Given number is found.");
				return true;
			}	
		}
		//System.out.println("Number "+target+" dosent found in given array.");
		return false;
	}
	
	public static void main(String[] args) {
		int[] nums = {10,23,23,44,23,10,23,4,23};
		System.out.println("Please enter target no");
		Scanner scan = new Scanner(System.in);
		int TargetNo = scan.nextInt();
		
		Program5 pro5 = new Program5();
		boolean ReturnValue = pro5.findTargetNum(nums, TargetNo);
		if (ReturnValue == false) 
			System.out.println("Number "+TargetNo+" dosent found in given array.");
		else
			System.out.println("Number "+TargetNo+" found in given array.");
		
	}
}
