package chaitanyaLokhande.assignment94;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class FirstMaxFreq {
	static char getFirstCharWithMaxFreq(String inputStr) {
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
						return ch;
					}
				}
			}
		}
		return '0';
	}

	public static void main(String[] args) {
		System.out.println(FirstMaxFreq.getFirstCharWithMaxFreq("aakanksha"));
	}

}
