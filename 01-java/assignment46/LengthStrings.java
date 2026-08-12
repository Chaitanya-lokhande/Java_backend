package chaitanyaLokhande.assignment46;

public class LengthStrings {
	void getLengthOfStringInArray(String[] input) {
		for(int index = 0; index < input.length; index++) {
			String temp = input[index];
			int count = 0;
			for(int i = 0; i < temp.length(); i++) {
				count += 1;
			}
			System.out.println(input[index] + " -> " + count);
		}
	}

	public static void main(String[] args) {
		LengthStrings lengthString = new LengthStrings();
		String[] arr = {"techno", "technocredits", "aaryahi"};
		lengthString.getLengthOfStringInArray(arr);
	}

}
