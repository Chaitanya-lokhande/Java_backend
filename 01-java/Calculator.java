package chaitanyaLokhande;

class Calculator{
	int num1 = 10;
	int num2 = 2;
	
	int addition(){
		System.out.println("Addition of " + num1 + " and " + num2 + " is " + (num1+num2));
		return num1+num2;
	}
	
	int substraction(){
		System.out.println("Substraction of " + num1 + " and " + num2 + " is " + (num1-num2));
		return num1-num2;
	}
	
	int multiplication(){
		System.out.println("Multiplication of " + num1 + " and " + num2 + " is " + (num1*num2));
		return num1*num2;
	}
	
	int division(){
		System.out.println("Division of " + num1 + " and " + num2 + " is " + (num1/num2));
		return num1/num2;
	}
	
	public static void main(String[] args){
		Calculator calculator = new Calculator();
		int sum = calculator.addition();
		int diff = calculator.substraction();
		int mul = calculator.multiplication();
		int div = calculator.division();
		
		System.out.println("Total is " + (sum + diff + mul + div));
	}
}
