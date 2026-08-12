package chaitanyaLokhande.assignment57;

import chaitanyaLokhande.assignment56.CharCountInArray;
import java.util.Scanner;

public class CharCountString extends CharCountInArray {
	void getCharFrequencyString(String input, char reqCh) {
		String[] inputArr = input.split(" ");
		getCharFreqInArray(inputArr, reqCh);
		
	}

	public static void main(String[] args) {
		CharCountString charCount = new CharCountString();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the String: ");
		String inputStr = scanner.nextLine();
		System.out.print("Enter character: ");
		char inpCh = scanner.next().charAt(0);
		charCount.getCharFrequencyString(inputStr, inpCh);

	}

}
