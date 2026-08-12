package chaitanyaLokhande.assignment47;

import java.util.Arrays;

public class ArrayUnion {
	int[] mergeArrays(int[] input1, int[] input2) {
		int[] output = new int[input1.length + input2.length];
		for(int index = 0; index < input1.length; index++) {
			output[index] = input1[index];
		}
		
		for(int index = 0; index < input2.length; index++) {
			output[input1.length + index] = input2[index];
		}
		return output;
	}
	
	public static void main(String[] args) {
		ArrayUnion arrayUnion = new ArrayUnion();
		int[] input1 = {10,12,3,4};
		int[] input2 = {44,1,55};
		int[] output = arrayUnion.mergeArrays(input1, input2);
		System.out.println("Merged Array : " + Arrays.toString(output));
		}
	}

