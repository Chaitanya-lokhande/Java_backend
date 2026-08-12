package chaitanyaLokhande.assignment33;

public class StringCompare {
	String compareString(String input) {
		int uCount = 0;
		int lCount = 0;
		for(int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if(!Character.isDigit(ch)) {
				if(Character.isUpperCase(ch)) {
					uCount += 1;
				}else {
					lCount += 1;
				}
			}
		}
			if(uCount == lCount) {
				return "Technocredits";
			}else if(uCount < lCount) {
				return "credits";
			}else {
				return "Techno";
			}
	}

	public static void main(String[] args) {
		StringCompare stringCompare = new StringCompare();
		String ans = stringCompare.compareString("TEChno");
		System.out.println(ans);
		ans = stringCompare.compareString("Chaitanya");
		System.out.println(ans);
		ans = stringCompare.compareString("LOKHandE");
		System.out.println(ans);
	}

}
