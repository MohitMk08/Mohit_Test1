/*Assignment - 25 : 18th April'2021
Program 2: Write a method which will return all String from given array which contains atleast 
one number. Main method should print the output.
Input : {"TechnoCredits", "HP1w", "Pd3R4K9", "Krishna", "Aashvi25"}
Output : HP1w Pd3R4K9 Aashvi25*/

package Mohit_K.Assignment25;

public class Program2 {

	String[] findNumMixWord(String[] input) {
		boolean isDigit = false;
		String[] numOp = new String[input.length];
		for(int index=0; index<input.length; index++) {
			String str = input[index];
			for(int word=0; word<str.length(); word++) {
				
				if(Character.isDigit(str.charAt(word))) {
					isDigit = true;
					numOp[word] = input[index];		
				    break;
				}
			}
			
		}
		return numOp;
		
	}
	public static void main(String[] args) {
		Program2 pro2 = new Program2();
		String[] arr1 = {"mohit","kar98","sangeeta","Minal","M16A4","kartik","AK47"};
		String[] output = pro2.findNumMixWord(arr1);
		
		for(int index=0; index<output.length; index++) {
			if(output[index] != null)
			System.out.println(output[index]);	
		}
	}
}
