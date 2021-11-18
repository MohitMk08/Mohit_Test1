/*Assignment 21: 14th April'2021 
Assignment 20 (both program) without using Character class method.

1) Count Digits,Letters, UpperCase characters, LowerCase characters, Special characters from predefined string.

Input: 1rRpd3F9#K(E
Output : 
Total digit: 3
Total Letters: 7
Total Uppercase: 4
Total Lowercase: 3
Total Special char: 2

 */

package Mohit_K.Assignment21;

public class Program1 {
	
	int digitCnt = 0;
	int UpperCaseCnt = 0;
	int LowerCaseCnt = 0;
	int SpecialCharCnt = 0;
	
	void findType() {
		String str = "1rRpd3F9#K(E./'}]!";
		int stringSize = str.length();
		
		for(int index=0; index<stringSize; index++) {
			int asciiValue = str.charAt(index);
			if(asciiValue > 64 && asciiValue < 91) {
				UpperCaseCnt++;
			}else if(asciiValue > 96 && asciiValue < 123) {
				LowerCaseCnt++;
			}else if(asciiValue > 47 && asciiValue < 58) {
				digitCnt++;
			}else {
				SpecialCharCnt++;
			}
		}
		System.out.println("\n Uppercase count in the given string is: "+UpperCaseCnt );
		System.out.println("\n Lowercase count in the given string is: "+LowerCaseCnt );
		System.out.println("\n Digits count in the given string is: "+digitCnt );
		System.out.println("\n Special Character count in the given string is: "+SpecialCharCnt );
	}
	public static void main(String[] args) {
		Program1 pro1 = new Program1();
		pro1.findType();
	}
	
}
