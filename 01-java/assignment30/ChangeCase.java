//Assignment 30
package chaitanyaLokhande.assignment30;

public class ChangeCase {
	String changeCaseString(String input) {
		String output = "";
		for(int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if(Character.isLetter(ch)) {
				if(Character.isUpperCase(ch)) {
					output += Character.toLowerCase(ch);
				}else {
					output += Character.toUpperCase(ch);
				}
			}else {
				output += ch;
			}
		}
		return output;
	}

	public static void main(String[] args) {
		ChangeCase changeCase = new ChangeCase();
		System.out.println(changeCase.changeCaseString("T1_eCHnoC"));
	}

}
