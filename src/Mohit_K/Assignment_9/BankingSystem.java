package Mohit_K.Assignment_9;

/*Assignment 9 : 2nd April 2021

Create a Banking System which has the following functionality.

Create two object to perform below scenario.
1) Method to debit amount
2) Method to credit amount
3) Method to printBalance [it will print current balance]
4) individualTransactionSummary() method should show how many times individually debit, credit & printBalance method called .
Hint : Create 3 non static instance variable.
Output :
user1 transaction summary : Credit - 2 times, Debit - 1 times, printBalance - 1 time
user2 transaction summary : Credit - 5 times, Debit - 2 times, printBalance - 0 time

5) allTransactionSummary() method should show by both users total how many times debit, credit & printBalance method get called.
Hint : Create 3 static variables will be required.
Output :
All transaction summary : Credit - 7 times, Debit - 3 times, printBalance - 1 time*/

public class BankingSystem {
	int totalBalance = 20000;
	int debitCount = 0;
	int creditCount = 0;
	int printBalCount = 0;
	static int totalDebitCount = 0;
	static int totalcreditCount = 0;
	static int totalprintBalCount = 0;
	
	
	void debitAmt(int ammount) {
		if (ammount <= totalBalance) {
			totalBalance = totalBalance - ammount;
		    debitCount++;
		    totalDebitCount++;
		}    
	}
	
	void creditAmt(int ammount) {
		totalBalance = totalBalance + ammount;
		creditCount++;
		totalcreditCount++;
	}
	
	void printBalance() {
		//System.out.println(" Current balance is : "+ totalBalance);
		printBalCount++;
		totalprintBalCount++;
	}
	
	void printStatement() {
		System.out.println("Credit - "+ creditCount +" times, "+ " Debit - "+ debitCount +" times, "+ "Balance print -"+ printBalCount+ " times");
	}
	
	void allTransactionSummary() {
		System.out.println("Total summary:- "+"Credit -" + totalcreditCount + " times, "+ " Debit -"+ totalDebitCount + " times, " + "Balance print -" + totalprintBalCount + " times");
	}
	
	
	public static void main(String[] args) {
		BankingSystem User1 = new BankingSystem();
		User1.debitAmt(5000);
		User1.debitAmt(1000);
		User1.debitAmt(2000);
		User1.debitAmt(500);
		User1.debitAmt(500);

		User1.creditAmt(1000);
		User1.creditAmt(1000);
		User1.printBalance();
		User1.printStatement();
		
		BankingSystem User2 = new BankingSystem();
		User2.debitAmt(1000);
		User2.debitAmt(1000);
		
		User2.creditAmt(300);
		User2.creditAmt(300);
		User2.creditAmt(300);
		User2.creditAmt(300);
		User2.creditAmt(300);
		User2.printStatement();
		User2.allTransactionSummary();
	}
}
