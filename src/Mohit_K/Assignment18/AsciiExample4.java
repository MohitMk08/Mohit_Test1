/*Program 4:  write a program which will print characters between ascii value 97 to 122.*/

package Mohit_K.Assignment18;

public class AsciiExample4 {
	void getChars() {
		for(int num = 97; num<123; num++) {
			char ascii = (char)num;
			System.out.println("\n "+ num +" ASCII value associated to : "+ ascii);
		}	
	}
	
	public static void main(String[] args) {
		AsciiExample4 ex4 = new AsciiExample4();
		ex4.getChars();
	}
}
