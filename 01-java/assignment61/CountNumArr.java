package chaitanyaLokhande.assignment61;

import java.util.Arrays;

public class CountNumArr {
	int[] getCountNumInArray(String[] inputArr) {
		int[] outputArr = new int[inputArr.length];
		for(int index = 0; index < inputArr.length; index++) {
			outputArr[index] = getNumCountString(inputArr[index]);
		}
		return outputArr;
	}
	int getNumCountString(String inputStr) {
		int count = 0;
		for(int i = 0; i < inputStr.length(); i++) {
			char ch = inputStr.charAt(i);
			if(Character.isDigit(ch)) {
				count += 1;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		CountNumArr countNum = new CountNumArr();
		String[] inputArr = {"tech2n4o", "c1red1its", "hello", "7h6i666"};
		int[] outputArr = countNum.getCountNumInArray(inputArr);
		System.out.println(Arrays.toString(outputArr));
	}

}
