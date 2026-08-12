//Assignment21
package chaitanyaLokhande.assignment21;

public class StringDupChar {
	void printDupChars(String input) {
		for(int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if(input.indexOf(ch) != input.lastIndexOf(ch)) {
				System.out.println(ch);
			}
		}
	}

	public static void main(String[] args) {
		StringDupChar stringDupChar = new StringDupChar();
		stringDupChar.printDupChars("technocreditst");

	}

}
