//Assignment 25
package chaitanyaLokhande.assignment25;

public class StringCountSpecial {
	int printCountSpecial(String input) {
		int count = 0;
		String spList = ",;' _()*&^";
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (spList.contains(String.valueOf(ch))) {
				count += 1;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		StringCountSpecial stringCountSpecial = new StringCountSpecial();
		int ans = stringCountSpecial.printCountSpecial("te!c,h(n[o");
		System.out.println("Count of Special Characters : " + ans);
	}

}
