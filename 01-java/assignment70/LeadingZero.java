package chaitanyaLokhande.assignment70;

public class LeadingZero {
	static String getFilteredStr(String input) {
		int count = 0;
		for(int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if(ch == '0')
				count++;
			else {
				break;
			}
		
		}
		return input.substring(count);
	}

	public static void main(String[] args) {
		System.out.println(LeadingZero.getFilteredStr("000techno"));
		System.out.println(LeadingZero.getFilteredStr("000tech0n00o"));
		System.out.println(LeadingZero.getFilteredStr("000123101"));
		System.out.println(LeadingZero.getFilteredStr("123123"));
		
	}

}
