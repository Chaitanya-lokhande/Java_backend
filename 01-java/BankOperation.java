//Assignment 7
package chaitanyaLokhande;
class BankOperation{
	static int balance;
	
	void initBalance(){
		balance = 500;
		System.out.println("Your balance has been initialized by 500");
	}
	
	void creditAmt(){
		balance += 300;
		System.out.println("Account is credited with 300 Rs. Your current balance is " + balance + " Rs.");
	}
	
	void debitAmt(){
		if (balance >= 500){
			balance -= 500;
			System.out.println("Account is debited with 500 Rs. Your current balance is " + balance + " Rs.");
		}
		else{
			System.out.println("Insufficient Funds! Your current balace is " + balance + " Rs.");
		}
	}
	
	void display(){
		System.out.println("Your current balance is " + balance);
	}
	
	public static void main(String[] args){
		BankOperation bankOperation = new BankOperation();
		bankOperation.initBalance();
		bankOperation.creditAmt();
		bankOperation.creditAmt();
		bankOperation.debitAmt();
		bankOperation.creditAmt();
		bankOperation.debitAmt();
		bankOperation.debitAmt();
		bankOperation.display();
	}
}