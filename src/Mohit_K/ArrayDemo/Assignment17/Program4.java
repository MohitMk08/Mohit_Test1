package Mohit_K.ArrayDemo.Assignment17;

/*Program 4:  From given numbers, return the frequency of target number.
input : 10,23,23,44,23,10,23,4,23
target number : 23         
output : Freq of 23 is 4*/

public class Program4 {
	
	void FindFrequency(int[] numbers) {
		int Numfrequency = 0;
		for(int index = 0; index < numbers.length; index++){
			if(numbers[index] == 23) 
				Numfrequency++;
		}
		System.out.println("Frequency of no 23 in given array is : "+Numfrequency);
	}
	
	public static void main(String[] args) {
		int[] nums = {10,23,23,44,23,10,23,4,23};
		Program4 pro4 = new Program4();
		pro4.FindFrequency(nums);
	}
}
