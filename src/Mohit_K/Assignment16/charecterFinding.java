package Mohit_K.Assignment16;

import java.util.Scanner;

/*Assignment - 16 : 9th April'2021

Find the frequency of character from a given String array.
Note: Take String and character from the user.

Input : technocredits
char : e

output : e -> 2*/

public class charecterFinding {
	
	//String str;
	//char ch;
	
	void targetChar(String word, char ch) {
		int Count = word.length();
		int targetCount = 0;
		
		for(int index = 0; index < word.length();index++) {
			
			if (word.charAt(index) == ch) {
				targetCount++;
			}
		}
		System.out.println("Frequencey of character '"+ ch +"' in String '"+word+"' is "+targetCount);
		
	}
	
	public static void main(String[] args) {
		charecterFinding charF = new charecterFinding();
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Input");
		String addWord = sc.next();
		System.out.println("Enter Character");
		String input = sc.next();
		char targetCh = input.charAt(0);

		charF.targetChar(addWord, targetCh);  
		
	}
}
