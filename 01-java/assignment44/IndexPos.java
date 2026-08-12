package chaitanyaLokhande.assignment44;

public class IndexPos {
	int getPosIndex(int[] input) {
		for (int index = 0; index < input.length; index++) {
			if (input[index] > 0) {
				return index;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		IndexPos indexPos = new IndexPos();
		int[] arr = { -55, -33, -22, 45, -66, 89 };
		System.out.println("First positive number is at index: " + indexPos.getPosIndex(arr));
	}

}
