//Assignment 6
package chaitanyaLokhande;
class BankDetailsCount{
	int debitCount;
	int creditCount;
	int printStatementCount;
	static int totalDebitCount;
	static int totalCreditCount;
	static int totalPrintStatementCount;
	
	void debitAmt(){
		debitCount += 1;
		totalDebitCount += 1;
	}
	
	void creditAmt(){
		creditCount += 1;
		totalCreditCount += 1;
	}
	
	void printStatement(){
		printStatementCount += 1;
		totalPrintStatementCount += 1;
	}
	
	void printCountInfo(){
		System.out.println("Debit method call count - " + debitCount);
		System.out.println("Credit method call count - " + creditCount);
		System.out.println("PrintStatement method call count - " + printStatementCount);
	}
	
	void printAllCountInfo(){
		System.out.println("Total debit Operations - " + totalDebitCount);
		System.out.println("Total credit Operations - " + totalCreditCount);
		System.out.println("Total print statement Operations - " + totalPrintStatementCount);
	}
	
	public static void main(String[] args){
		BankDetailsCount bankDetailsCount_1 = new BankDetailsCount();
		bankDetailsCount_1.debitAmt();
		bankDetailsCount_1.creditAmt();
		bankDetailsCount_1.creditAmt();
		bankDetailsCount_1.creditAmt();
		bankDetailsCount_1.printStatement();
		bankDetailsCount_1.printCountInfo();
		
		BankDetailsCount bankDetailsCount_2 = new BankDetailsCount();
		bankDetailsCount_2.creditAmt();
		bankDetailsCount_2.printStatement();
		bankDetailsCount_2.printStatement();
		bankDetailsCount_2.printStatement();
		bankDetailsCount_2.printCountInfo();
		
		bankDetailsCount_2.printAllCountInfo();
		
	}
}