package chaitanyaLokhande.assignment95;

import java.util.LinkedHashMap;
import java.util.Map;

public class LastMaxFreq {
	static char getLastCharWithMaxFreq(String inputStr) {
		char[] chArr = inputStr.toCharArray();
		char chOut = '0';
		int maxFreq = 0;
		Map<Character, Integer> charMap = new LinkedHashMap<Character, Integer>();
		for (char ch : chArr) {
			if (charMap.containsKey(ch)) {
				charMap.put(ch, charMap.get(ch) + 1);
			} else {
				charMap.put(ch, 1);
			}
			if (charMap.get(ch) >= maxFreq) {
				maxFreq = charMap.get(ch);
				chOut = ch;
			}
		}
		return chOut;
	}

	public static void main(String[] args) {
		System.out.println(LastMaxFreq.getLastCharWithMaxFreq("aakankshakk"));
	}

}
