package Mohit_K;
	
public class Bank {
	String name;
	int totalBal;
	int debitCount = 0;
	static int totalDebitCount = 0;
	
	void setData(int initialBal, String custName) {
		totalBal = initialBal;
		name = custName;
	}
	
	void debitAmt(int amount) {
		if(amount <= totalBal) {
			totalBal = totalBal + 1;
			debitCount = debitCount + 1;
			totalDebitCount = totalDebitCount + 1;
		}
	}
	
	void printDebitCnt() {
		System.out.println(name + " - Debit Operation Count : " + totalDebitCount);
	}
	
	void printBalance() {
		System.out.println("Total Balance : " + totalBal);
	}
	
	void printTotalDebitCnt() {
		System.out.println("Total Debit Count : " + totalDebitCount);

	}
	
	public static void main(String[] args) {
		Bank bank1 = new Bank();
		bank1.setData(10000, "Customer1");
		bank1.debitAmt(3000);
		bank1.debitAmt(1000);
		bank1.debitAmt(1200);
		bank1.printDebitCnt();
		
		Bank bank2 = new Bank();
		bank2.setData(50000, "Customer2");
		bank2.debitAmt(5000);
		bank2.debitAmt(1200);
		bank2.printDebitCnt();
		bank2.printTotalDebitCnt();
	}
}
