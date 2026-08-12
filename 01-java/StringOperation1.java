package chaitanyaLokhande;

public class StringOperation1 {
	void printAllChars(String input) {
		for(int count=0;count < input.length(); count++) {
			System.out.println(count + " -> " + input.charAt(count));
		}
	}
	public static void main(String[] args) {
		StringOperation1 stringOperation = new StringOperation1();
		stringOperation.printAllChars("techno");
	}

}
