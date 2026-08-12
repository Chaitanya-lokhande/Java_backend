package chaitanyaLokhande.assignment52;

import java.util.Scanner;

public class ScannerAgeDiff {
	int getAgeDifference() {
		int[] inputArr = getUserArray();
		int MinNum = Integer.MAX_VALUE;
		int MaxNum = Integer.MIN_VALUE;
		for(int i = 0; i < inputArr.length; i++) {
			if(inputArr[i] < MinNum) {
				MinNum = inputArr[i];
			}
		}
		for(int i = 0; i < inputArr.length; i++) {
			if(inputArr[i] > MaxNum) {
				MaxNum = inputArr[i];
			}
		}
		return MaxNum - MinNum;
	}
	
	int[] getUserArray() {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			int numberOfElem =0;
			boolean valid = true;
			System.out.print("Enter count of family members: ");
			numberOfElem = scanner.nextInt();
			if(numberOfElem < 2) {
				System.out.println("Enter atleast two family members.. Try Again!!");
				continue;
			}
			int[] inputArray = new int[numberOfElem];
			for(int index = 0; index < numberOfElem; index++) {
				System.out.print("Enter age of Family Member " + (index+1) + " : ");
				int input1 = scanner.nextInt();
				if(input1 > 0) {
					inputArray[index] = input1;
				}else {
					System.out.println("Age value cannot be negative. Try Again!!");
					valid = false;
					break;
				}
			}
			if(valid) {
				return inputArray;
			}
		}
	}

	public static void main(String[] args) {
		ScannerAgeDiff ageDiff = new ScannerAgeDiff();
		int ageDifference = ageDiff.getAgeDifference();
		System.out.println("Age Difference between Youngest and Eldest Family Members is: " + ageDifference);

	}

}
