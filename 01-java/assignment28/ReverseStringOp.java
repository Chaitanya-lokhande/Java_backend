//Assignment 28
package chaitanyaLokhande.assignment28;

public class ReverseStringOp {
	String printReverseString(String input) {
		String output = "";
		for (int index = (input.length() - 1); index >= 0; index--) {
			char ch = input.charAt(index);
			output += ch;
		}
		return output;
	}

	public static void main(String[] args) {
		ReverseStringOp reverseStringOp = new ReverseStringOp();
		String input = "techno";
		String reverse = reverseStringOp.printReverseString(input);
		System.out.println("Reverse of " + input + " is " + reverse);
	}

}
