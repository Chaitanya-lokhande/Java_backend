package chaitanyaLokhande.assignment63;

public class PrintPalindrome {
	void getPalindromeWords(String inputStr) {
		String[] strArr = inputStr.split(" ");
		for(int index = 0; index < strArr.length; index++) {
			if(isStringPalindrome(strArr[index]) && strArr[index].length() > 1) {
				System.out.println(strArr[index]);
			}
		}
	}
	
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
		PrintPalindrome printPalindrome = new PrintPalindrome();
		String inputStr = "This is Maulik I am a friend of nayan and naman and I see nitin is also my friend";
		printPalindrome.getPalindromeWords(inputStr);

	}

}
