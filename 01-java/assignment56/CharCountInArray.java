package chaitanyaLokhande.assignment56;

import java.util.Scanner;

public class CharCountInArray {
	protected void getCharFreqInArray(String[] inputArr, char ch) {
		int getCount = 0;
		for(int i = 0; i < inputArr.length; i++) {
			getCount = getCharFreq(inputArr[i],ch);
			System.out.println("Frequency of '" + ch + "' in '" + inputArr[i] + "': " + getCount);
		}	
	}
	int getCharFreq(String input, char ch) {
		int count = 0;
		for(int index = 0; index < input.length(); index++) {
			char newChar = input.charAt(index);
			if(newChar == ch || newChar == ch - 32 || newChar == ch + 32) {
				count++;
			}
		}
		
		return count;
	}
	
	void getUserInput() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter number of words in array: ");
		int userInputCount = scanner.nextInt();
		String[] inputArr = new String[userInputCount];
		for(int index = 0; index < userInputCount; index++) {
			System.out.print("Enter word: ");
			inputArr[index] = scanner.next();
		}
		System.out.print("Freqency of which letter? : ");
		char chFreq = scanner.next().charAt(0);
		
		getCharFreqInArray(inputArr, chFreq);
	}

	public static void main(String[] args) {
		CharCountInArray charCount = new CharCountInArray();
		charCount.getUserInput();

	}

}
