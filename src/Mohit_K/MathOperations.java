package Mohit_K;

/*Assignment 6 : 30th March 2021

Write only one program having following methods. [4 methods in same program]

1. On user define range print all even numbers.
Hint : pass start and end index as a parameter.
Input : Range -> 10 to 15
Output : Even numbers are:
		 10
		 12
		 14	

2. On user define range print all numbers which is divisible by 5.
Hint : pass start and end index as a parameter.
Input : Range -> 10 to 30
Output : Divisible by 5, numbers are:
		 10
		 15
		 20
		 25
		 30	

3. On user define range print all numbers which is divisible by 5 and divisible by 3.
Hint : pass start and end index as a parameter.
Input : Range -> 5 to 18
Output : Divisible by 5 & 3, numbers are:
		 15

4. On user define range print all numbers which is divisible by 7 or 13.
Hint : pass start and end index as a parameter.
Input : Range -> 5 to 40
Output : Divisible by 7 or 13, numbers are:
		 7 is divisible by 7
		 13 is divisible by 13
		 14 is divisible by 7
		 21 is divisible by 7
		 26 is divisible by 13
		 28 is divisible by 7
		 35 is divisible by 7
		 39 is divisible by 13
		 */

public class MathOperations {
	
	int startIndex;
	int endIndex;
	
	void evenNumbers(int startNum, int endNum){
		if(startNum == endNum) {
			System.out.println("Please input valid numbers range.");
		}else {
			int i = 0;
			for(i = startNum; i <= endNum; i++) {
				if (i%2 == 0) {
					System.out.println("Even numbers are : "+ i);
				}
			}
		}
	}
	
	void divisibleBy5(int startNum, int endNum) {
		if(startNum == endNum) {
			System.out.println("Please input valid numbers range.");
		}else {
			int index = 0;
			for(index = startNum; index <= endNum; index++) {
				if (index % 5 == 0) {
					System.out.println("Divisible by 5, numbers are : "+ index);
				}
			}
		}
	}
	
	void divisibleBy5and3(int startNum, int endNum) {
		if(startNum == endNum) {
			System.out.println("Please input valid numbers range.");
		}else {
			int index = 0;
			for(index = startNum; index <= endNum; index++) {
				if (index % 5 == 0 && index % 3 == 0) {
					System.out.println("Divisible by 5 & 3, numbers are : "+ index);
				}
			}
		}
	}
	
	void divisibleBy7Or13(int startNum, int endNum) {
		if(startNum == endNum) {
			System.out.println("Please input valid numbers range.");
		}else {
			int index = 0;
			for(index = startNum; index <= endNum; index++) {
				if (index % 7 == 0) {
					System.out.println(index + " is divisible by 7");
					
				}else if(index % 13 == 0) {
					System.out.println(index + " is divisible by 13");
				}
			}
		}
	}
	
	public static void main(String[] args){
		MathOperations mathoperations = new MathOperations();
		mathoperations.evenNumbers(10, 17);
		mathoperations.divisibleBy5(10, 20);
		mathoperations.divisibleBy5and3(5, 18);
		mathoperations.divisibleBy7Or13(5, 40);
		mathoperations.evenNumbers(2, 2);
	}
}
