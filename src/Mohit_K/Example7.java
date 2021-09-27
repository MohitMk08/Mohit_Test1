package Mohit_K;

public class Example7 {
	String name;
	 double price;
	  char qGrade = 'A';
	
	public static void main(String[] args) {
		Example7 example7 = new Example7();
		example7.price = 93.23;
		example7.name = "Mohit";
		example7.qGrade = 'B';
		
		Example7 example7_1 = new Example7();
		example7_1.qGrade = 'C';
		example7_1.qGrade = 'D';
		
		System.out.println(example7.name + "-" + example7.price + "-" + example7_1.qGrade);
		
	}
}
