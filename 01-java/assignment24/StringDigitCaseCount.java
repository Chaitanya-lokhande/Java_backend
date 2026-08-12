package chaitanyaLokhande.assignment24;

public class StringDigitCaseCount {
	void printCountDigitCase(String input) {
		int countOfDigit = 0;
		int countOfLower = 0;
		int countOfUpper = 0;
		int countOfSpecial = 0;
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isDigit(ch)) {
				countOfDigit += 1;
			} else if (Character.isUpperCase(ch)) {
				countOfUpper += 1;
			} else if (Character.isLowerCase(ch)) {
				countOfLower += 1;
			} else {
				countOfSpecial += 1;
			}
		}

		System.out.println("Digit -> " + countOfDigit);
		System.out.println("UpperCase -> " + countOfUpper);
		System.out.println("LowerCase -> " + countOfLower);
		System.out.println("Special -> " + countOfSpecial);
	}

	public static void main(String[] args) {
		StringDigitCaseCount stringDigitCaseCount = new StringDigitCaseCount();
		stringDigitCaseCount.printCountDigitCase("Te2chn6o,cre-4di_T!s");
	}

}
