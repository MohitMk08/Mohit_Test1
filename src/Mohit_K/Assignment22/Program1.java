/* Assignment-22
 * Create a class with following functionality. [Estimated time: 40 mins]
a) Find one character frequency from given name.
     Input: name - technocredits
               character - e
     Output : e -> 2 time in technocredits

*/

package Mohit_K.Assignment22;

public class Program1 {

	void findFreq(String str, char targetch) {
		int charFreqCount = 0;
		for(int index=0; index<str.length(); index++) {
			if(str.charAt(index) == targetch) {
				charFreqCount++;
			}
		}
		System.out.println(targetch +" -> "+ charFreqCount +" time in "+str );
	}
	
	public static void main(String[] args) {
		Program1 prog1 = new Program1();
		prog1.findFreq("technocredits", 'd');	}
}
