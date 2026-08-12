package chaitanyaLokhande.assignment23;

public class StringCountDigit {
	int printCountDigit(String input) {
		int count = 0;
		for(int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if(Character.isDigit(ch)) {
				count += 1;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		StringCountDigit stringCountDigit = new StringCountDigit();
		int ans = stringCountDigit.printCountDigit("Te2chn6ocre4diTs Kan2a3n4i");
		System.out.println("Digits : " + ans);
	}

}
