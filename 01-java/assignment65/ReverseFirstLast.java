package chaitanyaLokhande.assignment65;

public class ReverseFirstLast {
	String reverseFirstLastLetter(String inputStr) {
		char firstChar = inputStr.charAt(0);
		char lastChar =inputStr.charAt(inputStr.length()-1);
		
		String outputStr = inputStr.substring(1, inputStr.length()-1);
		return lastChar + outputStr + firstChar;
	}

	public static void main(String[] args) {
		ReverseFirstLast revFirstLast = new ReverseFirstLast();
		String output = revFirstLast.reverseFirstLastLetter("technocredits");
		System.out.println(output);

	}

}
