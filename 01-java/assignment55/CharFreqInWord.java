package chaitanyaLokhande.assignment55;

import java.util.Scanner;

public class CharFreqInWord {
	int getUserInput() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the Word: ");
		String userInput = scanner.next();
		System.out.print("Freqency of which letter? : ");
		char chFreq = scanner.next().charAt(0);
		int ans = getCharFreq(userInput, chFreq);
		return ans;
	}
	int getCharFreq(String input, char ch) {
		int count = 0;
		for(int index = 0; index < input.length(); index++) {
			char newChar = input.charAt(index);
			if(newChar == ch) {
				count++;
			}
		}
		
		return count;
	}

	public static void main(String[] args) {
		CharFreqInWord charFreq = new CharFreqInWord();
		int ans = charFreq.getUserInput();
		System.out.println("Frequency of character: " + ans);
	}

}
