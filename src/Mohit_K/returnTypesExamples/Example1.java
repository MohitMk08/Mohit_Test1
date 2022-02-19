package Mohit_K.returnTypesExamples;

public class Example1 {
	
	String m1(int x) {
		if(x == 10) {
			System.out.println("GM");
			return "Mohit";
		}else if(x == 9) {
			return "Minal";
		}
		System.out.println("Hi");
		System.out.println("Kartik");
		return "Sangeeta";
	}
	
	void processData(String name) {
		if(name.equals("Mohit")) {
			System.out.println("First name : "+ name);
			System.out.println("Last name : "+ "Kuttarmare");
			System.out.println("Roll number : "+ 1);
		}else if(name.equals("Minal")) {
			System.out.println("First name : "+ name);
			System.out.println("Last name : "+ "Shende");
			System.out.println("Roll number : "+ 2);
		}else {
			System.out.println("We don't have any info about : "+ name);
		}	
	}
	public static void main(String[] args) {
		Example1 ex1 = new Example1();
		int rollNo = 10;
		String name = ex1.m1(rollNo);
		ex1.processData(name);
	}
}
