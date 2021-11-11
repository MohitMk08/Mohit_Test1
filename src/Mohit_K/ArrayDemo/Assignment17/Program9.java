package Mohit_K.ArrayDemo.Assignment17;

/*Program 9:  return the index having minimum length from given string array.
input : {"Maulik", "Krishna", "Technocredits", "Kangan", "Harsh"};
output : 2*/

public class Program9 {

	String FindMinLengthWord(String[] Arr) {
		int ShortyWord = Arr[0].length();
		String minName = Arr[0];
		
		for(int index = 0; index < Arr.length; index++) {
			if(ShortyWord > Arr[index].length()) {
				ShortyWord = Arr[index].length();
				minName = Arr[index];
			}
				
		}
		return minName;
	}
	
	public static void main(String[] args) {
		String[] WordsArry = {"Mohit","Kartik","Sangeeta","Sunita","Rao","kk","Chetanrao"};
		Program9 pro9 = new Program9();
		String SWord = pro9.FindMinLengthWord(WordsArry);
		System.out.println("Min length word is : "+ SWord);
	}
}
