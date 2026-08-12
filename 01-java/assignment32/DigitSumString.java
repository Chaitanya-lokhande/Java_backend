//Assignment 32
package chaitanyaLokhande.assignment32;

public class DigitSumString {
	String convertString(String input) {
		String uTemp = "";
		String lTemp = "";
		int digitSum = 0;
		
		for(int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if(Character.isUpperCase(ch)) {
				uTemp += ch;
			}else if(Character.isLowerCase(ch)) {
				lTemp += ch;
			}else if(Character.isDigit(ch)) {
				digitSum += Character.getNumericValue(ch);
			}
		}
		return uTemp + digitSum + lTemp;
	}

	public static void main(String[] args) {
		DigitSumString digitSumString = new DigitSumString();
		String ans = digitSumString.convertString("t1eChnoc2redi5TS");
		System.out.println(ans);

	}

}
