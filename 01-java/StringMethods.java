//Assignment 20
package chaitanyaLokhande;

public class StringMethods {
	void printUniqueCharacter(String input) {
		for(int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if(input.indexOf(ch) == input.lastIndexOf(ch)) {
				System.out.print(ch);
			}
		}
	}

	public static void main(String[] args) {
		StringMethods stringMethods = new StringMethods();
		stringMethods.printUniqueCharacter("technocredits");

	}

}
