//Assignment 27
package chaitanyaLokhande.assignment27;

public class StringCountWords {
	int printCountWords(String input) {
		int count =0;
		for(int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if(ch == ' ') {
				count += 1;
			}
		}
		
		return count + 1;
	}

	public static void main(String[] args) {
		StringCountWords stringCountWords = new StringCountWords();
		int ans = stringCountWords.printCountWords("Hi this is technocredits java selenium april25 batch");
		System.out.println("Number of Words : " + ans);

	}

}
