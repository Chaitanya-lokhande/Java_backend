//Assignment 29
package chaitanyaLokhande.assignment29;

public class StringArrange {
	String printArrangeStr(String input) {
		String uTemp = "";
		String lTemp = "";
		String dTemp = "";
		String sTemp = "";

		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isUpperCase(ch)) {
				uTemp += ch;
			} else if (Character.isDigit(ch)) {
				dTemp += ch;
			} else if (Character.isLowerCase(ch)) {
				lTemp += ch;
			} else {
				sTemp += ch;
			}
		}
		return uTemp + dTemp + lTemp + sTemp;
	}

	public static void main(String[] args) {
		StringArrange stringArrange = new StringArrange();
		String ans = stringArrange.printArrangeStr("Te6ch!no_cr2edi3tS");
		System.out.println(ans);
	}

}
