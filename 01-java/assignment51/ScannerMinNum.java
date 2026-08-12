/**
 * 
 */
package chaitanyaLokhande.assignment51;

import java.util.Scanner;

public class ScannerMinNum {

	int getMinNumber() {
		int[] inputArr = getUserArray();
		int MinNum = Integer.MAX_VALUE;
		for(int i = 0; i < inputArr.length; i++) {
			if(inputArr[i] < MinNum) {
				MinNum = inputArr[i];
			}
		}
		return MinNum;
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
		ScannerMinNum scannerMin = new ScannerMinNum();
		int ans = scannerMin.getMinNumber();
		System.out.println("Minimum Number from given array is: " + ans);
	}

}
