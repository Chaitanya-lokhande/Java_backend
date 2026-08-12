package chaitanyaLokhande.assignment37;

public class AsciiArrangeString {
	String arrangeString(String input) {
		String uCase = "";
		String digit = "";
		String lCase = "";
		String sChars = "";

		for (int index = 0; index < input.length(); index++) {
			char letter = input.charAt(index);
			if (letter > 64 && letter < 90) {
				uCase += letter;
			} else if (letter > 96 && letter < 123) {
				lCase += letter;
			} else if (letter > 47 && letter < 58) {
				digit += letter;
			} else {
				sChars += letter;
			}
		}
		return uCase + digit + lCase + sChars;
	}

	public static void main(String[] args) {
		AsciiArrangeString asciiString = new AsciiArrangeString();
		String ans = asciiString.arrangeString("Te6ch!no_cr2edi3tS");
		System.out.println(ans);
	}

}
