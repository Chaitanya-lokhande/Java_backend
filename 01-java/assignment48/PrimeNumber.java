package chaitanyaLokhande.assignment48;

import java.util.Scanner;

public class PrimeNumber {
	boolean isPrimeNumber(int input) {
		int count = 0;
		for (int index = 2; index < input; index++) {
			if (input % index == 0) {
				count += 1;
				break;
			}
		}
		if (count > 0) {
			return false;
		} else {
			return true;
		}

	}

	public static void main(String[] args) {
		PrimeNumber primeNumber = new PrimeNumber();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int input = scanner.nextInt();
		boolean checkPrime = primeNumber.isPrimeNumber(input);
		if (checkPrime) {
			System.out.println(input + " is a Prime Number.");
		} else {
			System.out.println(input + " is not a Prime Number.");
		}
	}

}
