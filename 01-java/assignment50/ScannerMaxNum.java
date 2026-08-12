package chaitanyaLokhande.assignment50;

import java.util.Scanner;

public class ScannerMaxNum {
	int getMaxNumber() {
		int[] inputArr = getUserArray();
		int MaxNum = Integer.MIN_VALUE;
		for(int i = 0; i < inputArr.length; i++) {
			if(inputArr[i] > MaxNum) {
				MaxNum = inputArr[i];
			}
		}
		return MaxNum;
	}
	
	int[] getUserArray() {
		Scanner scanner = new Scanner(System.in);
		int numberOfElem =0;
		System.out.print("Enter number of elements in array: ");
		numberOfElem = scanner.nextInt();
		int[] inputArray = new int[numberOfElem];
		for(int index = 0; index < numberOfElem; index++) {
			System.out.print(index+1 + ". Enter a number: ");
			inputArray[index] = scanner.nextInt();
		}
		return inputArray;
	}

	public static void main(String[] args) {
		ScannerMaxNum scannerMaxNum = new ScannerMaxNum();
		int ans = scannerMaxNum.getMaxNumber();
		System.out.println("Maximum number from given array is: " + ans);
	}

}
