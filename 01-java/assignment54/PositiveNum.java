package chaitanyaLokhande.assignment54;

import java.util.Arrays;

public class PositiveNum {
	int[] getPosNum(int[] input) {
		int count = 0;
		for(int index = 0; index < input.length; index++) {
			if(input[index] > 0) {
				count++;
			}
		}
		int[] output = new int[count];
		count = 0;
		for(int index = 0;index < input.length; index++) {
			if(input[index] > 0) {
				count++;
				output[count-1] = input[index];
			}
		}
		return output;
	}

	public static void main(String[] args) {
		PositiveNum positiveNum = new PositiveNum();
		int[] inputArr = {-10, -33, 22, 45, 11, -89, 78};
		String ans = Arrays.toString(positiveNum.getPosNum(inputArr));
		System.out.println("Array of Positive Numbers: " + ans);
	}

}
