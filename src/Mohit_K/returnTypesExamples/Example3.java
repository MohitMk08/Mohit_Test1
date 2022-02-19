package Mohit_K.returnTypesExamples;

public class Example3 {
	
	
	String getStdName(int rollNum) {
		if (rollNum == 10) {
			System.out.println("X is 10");
			return "Sangeeta";
		}else if(rollNum <= 20 && rollNum > 10) {
			return "Maulik";
		}	
		System.out.println("hello");
		return "Bhushan";
	}
	
	public static void main(String[] args) {
		Example3 exm3 = new Example3();
		exm3.getStdName(10);
	
	}
}
