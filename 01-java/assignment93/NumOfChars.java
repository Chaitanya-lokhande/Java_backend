package chaitanyaLokhande.assignment93;

import java.util.LinkedHashSet;
import java.util.Set;

public class NumOfChars {
	Set<Character> getCharsToFormString(String inputStr) {
		char[] charArr = inputStr.toCharArray();
		Set<Character> charSet = new LinkedHashSet<Character>();
		for (char ch : charArr) {
			charSet.add(ch);
		}
		return charSet;
	}

	public static void main(String[] args) {
		NumOfChars numOfChars = new NumOfChars();
		Set<Character> outputSet = numOfChars.getCharsToFormString("aakanksha");
		System.out.println(outputSet);
	}

}
