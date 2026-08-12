package chaitanyaLokhande.assignment62;

public class PalindromString {
	boolean isStringPalindrome(String inputStr) {
		for(int index = 0; index <= inputStr.length()/2; index++) {
			char ch1 = inputStr.charAt(index);
			char ch2 = inputStr.charAt(inputStr.length()-1-index);
			if(ch1!=ch2) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		PalindromString palindromeStr = new PalindromString();
		String str = "nayan";
		if(palindromeStr.isStringPalindrome(str)) {
			System.out.println(str + " is palindrome.");
		}else {
			System.out.println(str + " is not palindrome.");
		}
	}

}
