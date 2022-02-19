/* Assignment - 25 : 18th April'2021
Program 3:  Write a method which will return sum of each all numbers in each String.
 Main method should print the output.
Input : {"Tech1No2Credits3", "Ha6rs8h", "Ra9dh3a", "Sha1sha5nk9","Kan3gan4", "1Sandesh3"}
Output : 6 14 12 15 7 4
*/
package Mohit_K.Assignment25;

public class Program3 {

	int[] findNumMixWord(String[] input) {
		int[] numOp = new int[input.length];
		int outputIndex = 0;
		for(int index=0; index<input.length; index++) {
			String str = input[index];
			int sum = 0;
			
			for(int wordIndex=0; wordIndex<str.length(); wordIndex++) {
				char ch = str.charAt(wordIndex);
				if(Character.isDigit(ch)) {
					sum = sum + Integer.parseInt(String.valueOf(ch));
				}
				
			}
			numOp[outputIndex] = sum;
			outputIndex++;
		}
		
		return numOp;
		
	}
	public static void main(String[] args) {
		Program3 pro3 = new Program3();
		String[] arr1 = {"mohit","kar98","sangeeta","Minal","M16A4","kartik","AK47"};
		int[] output = pro3.findNumMixWord(arr1);
		
		for(int index=0; index<output.length; index++) {
			if(output[index] != 0)
			System.out.println(output[index]);	
		}
	}
}
