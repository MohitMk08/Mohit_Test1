/* Assignment-22
  b) Find all character frequency from given name. using scanner class
     Input: name - aakanksha
     Output : a -> 4
	          k -> 2
              n -> 1
              s -> 1
              h -> 1*/

package Mohit_K.Assignment22;

import java.util.Scanner;

public class Program3 {

	void findFreq(String str, char targetch) {
		int charFreqCount = 0;
		for(int index=0; index<str.length(); index++) {
			if(str.charAt(index) == targetch) {
				charFreqCount++;
			}
		}
		System.out.println(targetch +" -> "+ charFreqCount +" time in "+str );
	}
	
	void getFreqOfAllChar(String word) {
		
		for(int index=0; index<word.length(); index++) {
			char ch = word.charAt(index);
			if(index == word.indexOf(ch)) {
				findFreq(word,word.charAt(index));
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any word: ");
		String word = scanner.next();
		Program3 pro3 = new Program3();
		//String word = "Mohitkuttarmare";
		pro3.getFreqOfAllChar(word);
		
	}
}

