/* Assignment-22
  b) Find all character frequency from given name.
     Input: name - aakanksha
     Output : a -> 4
	          k -> 2
              n -> 1
              s -> 1
              h -> 1*/

package Mohit_K.Assignment22;

public class Program2 {
	
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
		Program2 pro2 = new Program2();
		String word = "Mohitkuttarmare";
		pro2.getFreqOfAllChar(word);
		
	}
}
