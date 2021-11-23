/* Assignment-22
 c) Find all character frequency from each name given in String array.
     Input : Array -> {"raj", "aarya", "aavruti", "shruti"}
     Output : r -> 1 time in raj
              a -> 1 time in raj
              j -> 1 time in raj
         =====================
	     a -> 3 time in aarya
             r -> 1 time in aarya
              y -> 1 time in aarya
         ====================
         And so on....	-------------------------------*/

package Mohit_K.Assignment22;

public class Program4 {
	
	void stringArray(String[] sentance) {
		for(int index=0; index<sentance.length; index++) {
			getFreqOfAllChar(sentance[index]);
			System.out.println("========================= \n");
		}
	}

	void findFreq(String str, char targetch) {
		int charFreqCount = 0;
		for(int index=0; index<str.length(); index++) {
			if(str.charAt(index) == targetch) {
				charFreqCount++;
			}
			
		}
		
		System.out.println(targetch +" -> "+ charFreqCount +" time in "+str);
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
		 Program4 pro4 = new Program4();
			String[] sentance = {"raj", "aarya", "aavruti", "shruti"};
		    pro4.stringArray(sentance);
	}
	
}
