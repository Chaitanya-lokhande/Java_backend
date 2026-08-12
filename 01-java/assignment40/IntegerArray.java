package chaitanyaLokhande.assignment40;

public class IntegerArray {
	void printNumbersDiv(int[] input) {
		for (int index = 0; index < input.length; index++) {
			if (input[index] % 3 == 0 || input[index] % 5 == 0) {
				System.out.println(input[index]);;
			}
		}
	}

	public static void main(String[] args) {
		IntegerArray integerArray = new IntegerArray();
		int[] arr = { 10, 30, 22, 45, 67, 98, 99 };
		integerArray.printNumbersDiv(arr);
	}

}
