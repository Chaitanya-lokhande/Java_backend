//Assignment 5
package chaitanyaLokhande;
class BankDetails{
	int balance = 1000;
	int creditCount;
	int debitCount;
	int printStatementCount;
	
	void creditAmt(){
		balance += 400;
		creditCount++;
	}
	
	void debitAmt(){
		balance -= 200;
		debitCount++;
	}
	
	void printStatement(){
		System.out.println("Balance is " + balance);
		printStatementCount++;
	}
	
	void printCountInfo(){
		System.out.println("Debit call count - " + debitCount);
		System.out.println("Credit call count - " + creditCount);
		System.out.println("Print Statement call count - " + printStatementCount);
	}
	
	public static void main(String[] args){
		BankDetails bankDetails = new BankDetails();
		bankDetails.debitAmt();
		bankDetails.creditAmt();
		bankDetails.creditAmt();
		bankDetails.creditAmt();
		bankDetails.printStatement();
		bankDetails.printCountInfo();		
	}
}