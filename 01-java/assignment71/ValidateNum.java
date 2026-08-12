package chaitanyaLokhande.assignment71;

public class ValidateNum {
	boolean isSumGreater(int[] arr) {
		int maxNum = 0;
		int minNum = 0;
		int sum = 0;
		for (int index = 0; index < arr.length; index++) {
			sum = sum + arr[index];
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > maxNum) {
				minNum = maxNum;
				maxNum = arr[i];
			} else if (arr[i] > minNum) {
				minNum = arr[i];
			}
		}
		if ((minNum * maxNum) > (2 * sum)) {
			return true;
		} else
			return false;
	}

	public static void main(String[] args) {
		ValidateNum validateNum = new ValidateNum();
		int[] input1 = { 1, 2, 3, 4, 5 };
		System.out.println(validateNum.isSumGreater(input1));
		int[] input2 = { 10, 20, 30, 40 };
		System.out.println(validateNum.isSumGreater(input2));
		int[] input3 = { 1, 1, 1, 1 };
		System.out.println(validateNum.isSumGreater(input3));
		int[] input4 = { 200, 100, 1, 2 };
		System.out.println(validateNum.isSumGreater(input4));

	}

}
