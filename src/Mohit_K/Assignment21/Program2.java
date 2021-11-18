/*2) WAP to sum all the numbers in given string.
Input: J7yu9y8h1h8j4b7j3jjb6
Ouput: Sum of all digits in String is: 53*/

package Mohit_K.Assignment21;

public class Program2 {
	
	void SumOfDegits() {
		String str = "J7yu9y8h1h8j4b7j3jjb6";
		//System.out.println(str.charAt(1));
		
		int stringSize = str.length();
		int sum = 0;
		for(int index = 0; index < str.length(); index++) {
			int asciiValue = str.charAt(index);
			
			if(asciiValue >= 48 && asciiValue <= 57) {
				int numValue = Character.getNumericValue(str.charAt(index));
				sum = sum + numValue;
			}
		}
		System.out.println("Sum of all digits found in the given string is : "+sum);
	}
	
	public static void main(String[]args) {
		Program2 pr2 = new Program2();
		pr2.SumOfDegits();
	}
}
