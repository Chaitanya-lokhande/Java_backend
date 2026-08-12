package chaitanyaLokhande.assignment96;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MaxFreqChars {
	static void getFirstCharWithMaxFreq(String inputStr) {
		char[] chArr = inputStr.toCharArray();
		Map<Character, Integer> charMap = new LinkedHashMap<Character, Integer>();
		for (char ch : chArr) {
			if (charMap.containsKey(ch)) {
				charMap.put(ch, charMap.get(ch) + 1);
			} else {
				charMap.put(ch, 1);
			}
		}
		Set<Character> charSet = charMap.keySet();
		for (int index = charMap.size() - 1; index >= 0; index--) {
			if (charMap.containsValue(index)) {
				for (char ch : charSet) {
					if (charMap.get(ch) == index) {
						System.out.println(ch + " ");
					}
				}
			}else {
				break;
			}
		}
	}

	public static void main(String[] args) {
		MaxFreqChars.getFirstCharWithMaxFreq("aakankshakknnn");
	}

}
