package chaitanyaLokhande.assignment41;

public class ArrayPosSum {
	int returnSumPosNumbers(int[] input) {
		int sum = 0;
		for (int index = 0; index < input.length; index++) {
			if (input[index] > 0) {
				sum = sum + input[index];
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		ArrayPosSum sumArray = new ArrayPosSum();
		int[] arr = { -10, -44, 55, -66, 5 };
		int output = sumArray.returnSumPosNumbers(arr);
		System.out.println(output);
	}

}
