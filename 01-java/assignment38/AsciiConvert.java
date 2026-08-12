package chaitanyaLokhande.assignment38;

public class AsciiConvert {
	String convertString(String input) {
		String output = "";

		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (ch > 64 && ch < 90) {
				ch = (char) (ch + 32);
				output = output + ch;

			} else if (ch > 96 && ch < 123) {
				ch = (char) (ch - 32);
				output = output + ch;
			} else {
				output = output + ch;
			}
		}
		return output;
	}

	public static void main(String[] args) {
		AsciiConvert asciiConvert = new AsciiConvert();
		String ans = asciiConvert.convertString("T1_eCHnoC");
		System.out.println(ans);
	}

}
