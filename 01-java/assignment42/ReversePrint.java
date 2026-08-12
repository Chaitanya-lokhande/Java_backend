package chaitanyaLokhande.assignment42;

public class ReversePrint {
	void printArrayRev(String[] input) {
		for (int index = (input.length - 1); index >= 0; index--) {
			System.out.println(input[index]);
		}
	}

	public static void main(String[] args) {
		ReversePrint revPrint = new ReversePrint();
		String[] arr = { "techno", "technocredits", "aaryahi" };
		revPrint.printArrayRev(arr);
	}

}
