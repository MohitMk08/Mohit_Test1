/*Program 3:  write a method which will print ascii value of A to Z.*/
package Mohit_K.Assignment18;

public class ASCIIExample3 {

	void getAtoZAsciivalue() {
		for(char ch = 'A'; ch<='Z'; ch++) {
			int ascii = (int)ch;
			System.out.println("\n ASCII value of " + ch +" is : "+ ascii);
		}	
	}
	
	public static void main(String[] args) {
		ASCIIExample3 ex3 = new ASCIIExample3();
		ex3.getAtoZAsciivalue();
	}
}
