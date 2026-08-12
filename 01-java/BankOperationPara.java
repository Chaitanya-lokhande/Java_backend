//Assignment 8
package chaitanyaLokhande;
class BankOperationPara{
	static int balance;
	
	void initBalance(int balAmt){
		balance = balance + balAmt;
		System.out.println("Your balance has been initialized by " + balAmt + " Rs. Your current balance is " + balance + " Rs.");
	}
	
	void creditAmt(int credAmt){
		balance += credAmt;
		System.out.println("Account is credited with " + credAmt + " Rs. Your current balance is " + balance + " Rs.");
	}
	
	void debitAmt(int debAmt){
		if (balance >= debAmt){
			balance -= debAmt;
			System.out.println("Account is debited with " + debAmt + " Rs. Your current balance is " + balance + " Rs.");
		}
		else{
			System.out.println("Insufficient Funds! Your current balance is " + balance + " Rs.");
			System.out.println("Your requested amount: " + debAmt + " Rs.");
		}
	}
	
	void display(){
		System.out.println("Your current balance is " + balance);
	}
	
	public static void main(String[] args){
		BankOperationPara bankOperationPara = new BankOperationPara();
		bankOperationPara.initBalance(5000);
		System.out.println("--------------------------------------------");
		bankOperationPara.creditAmt(2000);
		System.out.println("--------------------------------------------");
		bankOperationPara.creditAmt(500);
		System.out.println("--------------------------------------------");
		bankOperationPara.debitAmt(9500);
		System.out.println("--------------------------------------------");
		bankOperationPara.creditAmt(1500);
		System.out.println("--------------------------------------------");
		bankOperationPara.debitAmt(6000);
		System.out.println("--------------------------------------------");
		bankOperationPara.debitAmt(2500);
		System.out.println("--------------------------------------------");
		bankOperationPara.display();
	}
}