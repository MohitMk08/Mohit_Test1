package Mohit_K.Assignment12;

/*Assignment 12 : 5th April 2021

Design to test static, non static, return type concepts.

1) Method sum() - non static method, accept 3 parameters of type double & return answer

2) Method average()- non static method, accept 3 parameters of type double & return answer

3) Method isAnswerAboveExpecation() - non static method, take one parameter (answer which you received from average method) and return true if value is more then 50 else false.

4) Method isEligible() - static method,take one parameter (answer which you received from average method) return true if value is more then 50 or divisible by 2. Eligibility will be printed in main method. 

5) Method getYourGrade() - static method, take one parameter (answer which you received from average method) return "A Grade" if average is more then 80 else "B grade", main method will print grade received from getYourGrade() method.

Sample input1 : 
10,20,30
Sample output1 : 
Candidate is Eligible
Candidate obtained B grade.

Sample input2 : 
50,20,20
Sample output2 : 
Candidate is Eligible
Candidate obtained A grade.

Note : Sum method should not be called from main method, it should be called from Average method (think about code reusability).

Complete this assignment by Monday EOD.*/

public class SumAndAverage {
	
	double sum(double num1, double num2, double num3) {
		double Answer = num1 + num2 + num3;
		return Answer;
		
	}
	
	double average(double numbr1, double numbr2, double numbr3) {
		double total = sum(numbr1, numbr2 , numbr3);
		double Average = total / 3;
		System.out.println("Average is "+Average);
		return Average;
	}
	
	boolean isAnswerAboveExpecation(double Average) {
		if (Average >= 50) {
			return true;
		}else
			return false;
	}
	
	static String isEligible(double Average) {
		if (Average > 50 && Average % 2 ==0) {
			String EleMsg = ("Candidate is eligible");
			return EleMsg;
		}
			String EleMsg = ("Candidate is not eligible");
			return EleMsg;
	}
	
	static String getYourGrade(double AvgNum) {
		if (AvgNum > 80) {
			String grade = "A Grade";
			return grade;
		}
		String grade = "B Grade";
		return grade;
	}
	
	public static void main(String[] args) {
		SumAndAverage Savg = new SumAndAverage();
		 double Average = Savg.average(10, 20, 30);
		//Savg.average(10, 20, 30);
		System.out.println(getYourGrade(Average));
		 System.out.println(isEligible(Average));	
		
	}
	
}
