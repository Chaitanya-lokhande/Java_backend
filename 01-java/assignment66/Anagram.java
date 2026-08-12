package chaitanyaLokhande.assignment66;

public class Anagram {
	boolean isAnagram(String input1, String input2) {
		if(input1.length() != input2.length())
			return false;
		int len = input1.length();
		input1 = input1.toLowerCase();
		input2 = input2.toLowerCase();
		
		for(int i = 0; i < len; i++) {
			char ch = input1.charAt(0);
			input1 = input1.replace(Character.toString(ch), "");
			input2 = input2.replace(Character.toString(ch), "");
			if(input1.length() == input2.length()) {
				continue;
			}else 
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		Anagram anagram = new Anagram();
		String word1 = "silent";
		String word2 = "listen";
		if(anagram.isAnagram(word1, word2)){
			System.out.println(word1 + " and " + word2 +" are anagram.");
		}else {
			System.out.println(word1 + " and " + word2 +" are not anagram.");
		}
	}

}
