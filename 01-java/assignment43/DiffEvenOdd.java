package chaitanyaLokhande.assignment43;

public class DiffEvenOdd {
	int diffEvenOddArray(int[] input) {
		int evenSum = 0;
		int oddSum = 0;
		for (int index = 0; index < input.length; index++) {
			if (input[index] % 2 == 0) {
				evenSum += input[index];
			} else {
				oddSum += input[index];
			}
		}
		if (evenSum > oddSum) {
			return evenSum - oddSum;
		} else {
			return oddSum - evenSum;
		}

	}

	public static void main(String[] args) {
		DiffEvenOdd diffEvenOdd = new DiffEvenOdd();
		int[] arr = { 4, 6, 12, 17, 13 };
		System.out.println(diffEvenOdd.diffEvenOddArray(arr));

	}

}
