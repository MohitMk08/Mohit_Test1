package Mohit_K.returnTypesExamples;

public class Example2 {
	
	int add(int x, int y) {
		int z = x+y;
		return z;
	}
	
	int sub(int x, int y) {
		int z = x-y;
		return z;	}
	
	int mul(int x, int y) {
		int z = x*y;
		return z;	}
	
	void printTotal(int sumAnswer, int subAnswer, int mulAnswer) {
		int total = sumAnswer + subAnswer + mulAnswer;
		System.out.println(total);
	}
	
	public static void main(String[] args) {
		Example2 example2 = new Example2();
		int sumAnswer = example2.add(10, 30);
		int subAnswer = example2.sub(50, 48);
		int mulAnswer = example2.mul(3, 10);
		
		example2.printTotal(sumAnswer, subAnswer, mulAnswer);
	}
}
