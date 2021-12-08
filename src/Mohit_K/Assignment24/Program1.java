/*Assignment - 24 : 18th April'2021

Create a method which will return middle character of each String. Print output in main method.
String[] arr = {"Techno", "Hello", "Credits"};
output : c l d

Note:  for name having even length, consider length/2-1 index is middle character.*/

package Mohit_K.Assignment24;


public class Program1 {

	char[] getMiddleChar(String[] words) {
		char[] output = new char [words.length];
		for(int index=0;index<words.length; index++) {
			int midChar = 0;
			String name = words[index];
			if(words[index].length() % 2 == 0) {
				midChar = (name.length() / 2 - 1);
				output[index] = name.charAt(midChar);
			}
			else {
				 midChar = (name.length() / 2  );
				 output[index] = name.charAt(midChar);
			}    
		}
		return output;
	}
	
	public static void main(String[] args) {
		String[] input = {"Mohit" ,"mahesh","kartik","sangeeta","Ram"};
		Program1 pro1 = new Program1();
		char[] op = pro1.getMiddleChar(input);
		
		for(int index=0; index<op.length; index++) {
			System.out.println("character at middle possition is : "+op[index]);
		}
	}
}
