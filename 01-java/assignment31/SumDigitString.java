//Assignment 31
package chaitanyaLokhande.assignment31;

public class SumDigitString {
	int printSumOfDigits(String input) {
		int sum = 0;
		for(int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if(Character.isDigit(ch)) {
				sum = sum + Character.getNumericValue(ch);
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		SumDigitString sumDigitString = new SumDigitString();
		int ans = sumDigitString.printSumOfDigits("tech3no3cre4dit9s");
		System.out.println(ans);
	}

}
