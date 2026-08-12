package chaitanyaLokhande.assignment64;

import java.util.Arrays;

public class FirstCapLetter {
	char[] getFirstCapLetterArray(String[] inputArr) {
		char[] outputArr = new char[inputArr.length];
		for(int index = 0; index < inputArr.length; index++) {
			char outChar = getFirstCapLetter(inputArr[index]);
			outputArr[index] = outChar;
		}
		return outputArr;
	}
	
	char getFirstCapLetter(String inputStr) {
		for(int i = 0; i < inputStr.length(); i++) {
			char ch = inputStr.charAt(i);
			if(Character.isUpperCase(ch)) {
				return ch;
			}
		}
		
		return '-';
	}

	public static void main(String[] args) {
		FirstCapLetter firstCapLetter = new FirstCapLetter();
		String[] inputArr = {"teCh2n4o", "c1red1iTs", "hEllo", "7H6i666","hello"};
		char[] outputArr = firstCapLetter.getFirstCapLetterArray(inputArr);
		System.out.println(Arrays.toString(outputArr));
	}

}
