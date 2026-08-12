package chaitanyaLokhande.assignment92;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class UniqueChar {
	void printUniqueCharOfString(String inputStr) {
		char[] chArr = inputStr.toCharArray();
		Map<Character, Integer> newMap = new LinkedHashMap<Character, Integer>();
		for (char ch : chArr) {
			if (newMap.containsKey(ch)) {
				newMap.put(ch, newMap.get(ch) + 1);
			} else {
				newMap.put(ch, 1);
			}
		}
		Set<Character> charSet = newMap.keySet();
		for (Character ch : charSet) {
			if (newMap.get(ch) == 1) {
				System.out.println(ch + " -> " + newMap.get(ch));
			}
		}
	}

	public static void main(String[] args) {
		UniqueChar uniqueChar = new UniqueChar();
		uniqueChar.printUniqueCharOfString("aakanksha");
	}

}
