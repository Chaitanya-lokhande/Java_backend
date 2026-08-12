package chaitanyaLokhande.assignment26;

public class StringCountSpecialChar {
	int printSpecialChar(String input) {
		int count = 0;
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (!Character.isLetter(ch) && !Character.isDigit(ch)) {
				count += 1;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		StringCountSpecialChar stringCountSpecialChar = new StringCountSpecialChar();
		int ans = stringCountSpecialChar.printSpecialChar("te_chn oc!re[dit]s");
		System.out.println("Count of Special Characters : " + ans);
	}

}
