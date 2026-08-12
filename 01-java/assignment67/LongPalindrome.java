package chaitanyaLokhande.assignment67;

public class LongPalindrome {

	String resultStr ="a";
	String getLongPlaindrome(String inputStr) {
		String[] strArr = inputStr.split(" ");
		for(int index = 0; index < strArr.length; index++) {
			if(isPalindrome(strArr[index])) {
				if(strArr[index].length() > resultStr.length()) {
					resultStr = strArr[index];
				}
			}
		}
		return resultStr;
	}
	
	boolean isPalindrome(String inputStr) {
		for(int i = 0; i <= inputStr.length()/2; i++) {
			char ch = inputStr.charAt(i);
			char ch2 = inputStr.charAt(inputStr.length() -1 -i);
			if(ch != ch2) {
				return false;
			}
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		String str = "naman hello hi techhcet technocredits nitin world";
		LongPalindrome longP = new LongPalindrome();
		String output = longP.getLongPlaindrome(str);
		System.out.println(output);

	}

}
