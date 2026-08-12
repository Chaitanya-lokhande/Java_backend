package chaitanyaLokhande.assignment49;

import java.util.Scanner;

public class ScannerAddNum {
	int getSumNumbers(int input1, int input2) {
		int sum = 0;
		sum = input1 + input2;
		return sum;
	}
	
	int getUserInputs() {
		int ans = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int input1 = scanner.nextInt();
		System.out.print("Enter second number: ");
		int input2 = scanner.nextInt();
		ans = getSumNumbers(input1, input2);
		return ans;
	}

	public static void main(String[] args) {
		ScannerAddNum scannerAddNum = new ScannerAddNum();
		System.out.println("Addition of given numbers is: " + scannerAddNum.getUserInputs());

	}

}
