package Mohit_K.ArrayDemo.Assignment17;

/*Program 8:  return the name having maximum length.
input : {"Maulik", "Krishna", "Technocredits", "Kangan", "Harsh"};
output : Technocredits*/

public class Program8 {

	String FindMaxLengthWord(String[] Arr) {
		int LengthyWord = Arr[0].length();
		String maxName = Arr[0];
		
		for(int index = 0; index < Arr.length; index++) {
			if(LengthyWord < Arr[index].length()) {
				LengthyWord = Arr[index].length();
				maxName = Arr[index];
			}
				
		}
		return maxName;
	}
	
	public static void main(String[] args) {
		String[] WordsArry = {"Mohit","Kartik","Sangeeta","Sunita","Mahadeorao","Minal","Chetanrao"};
		Program8 pro8 = new Program8();
		String LWord = pro8.FindMaxLengthWord(WordsArry);
		System.out.println("Max length word is : "+ LWord);
	}
}
