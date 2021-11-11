package Mohit_K.ArrayDemo.Assignment17;

/*Program 3:  From given numbers, count the negative and positive numbers.
input : 10,23,26,-27,-88,87,-65 
output : negative -> 3
         positive -> 4*/
         
public class Program3 {
	
	void NumberTypeFind(int[] num) {
		int NegativeCount = 0;
		int PositiveCount = 0;
		
		for(int index=0; index <num.length; index++) {
			if(num[index] < 0) {
				NegativeCount++;
			}else {
				PositiveCount++;
			}
		}
		System.out.println(" ========= In a given array ========== \n");
		System.out.println(NegativeCount + " negative numbers are found \n");
		System.out.println(PositiveCount + " positive numbers are found");
	}
	
	public static void main(String[] args) {
		int[] numbers = {10,23,26,-27,-88,87,-65};
		
		Program3 pro3 = new Program3();
		pro3.NumberTypeFind(numbers);
		
	}

	
}
