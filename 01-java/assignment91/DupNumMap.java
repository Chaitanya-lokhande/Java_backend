package chaitanyaLokhande.assignment91;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class DupNumMap {
	void getDupNumWithFreq(int[] inputArr) {
		Map<Integer, Integer> newMap = new LinkedHashMap<Integer, Integer>();
		for (int i : inputArr) {
			if (newMap.containsKey(i)) {
				newMap.put(i, newMap.get(i) + 1);
			} else {
				newMap.put(i, 1);
			}
		}
		Set<Integer> outSet = newMap.keySet();
		for (Integer i : outSet) {
			if (newMap.get(i) > 1) {
				System.out.println(i + " -> " + newMap.get(i));
			}
		}
	}

	public static void main(String[] args) {
		DupNumMap dupNumMap = new DupNumMap();
		int[] input = { 15, 44, 13, 12, 15, 44, 44, 44 };
		dupNumMap.getDupNumWithFreq(input);
	}

}
