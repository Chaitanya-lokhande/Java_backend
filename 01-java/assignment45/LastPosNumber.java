package chaitanyaLokhande.assignment45;

public class LastPosNumber {
	int getLastPosNum(int[] input) {
		for (int index = input.length - 1; index > 0; index--) {
			if (input[index] > 0) {
				return index;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		LastPosNumber lastPos = new LastPosNumber();
		int[] arr = { -55, -33, -22, 45, -66, 89, -90 };
		System.out.println("Last positive number is at index: " + lastPos.getLastPosNum(arr));
	}

}
