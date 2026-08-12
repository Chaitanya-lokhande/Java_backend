package chaitanyaLokhande;

public class StringOperation2 {
	void printFrequency(String input,char ch) {
		int count = 0;
		for(int index=0; index < input.length(); index++) {
			if(input.charAt(index) == ch) {
				count++;
			}
		}
		System.out.println(ch + " -> " + count);
	}

	public static void main(String[] args) {
		StringOperation2 stringOperation2 = new StringOperation2();
		stringOperation2.printFrequency("Technocredits",'e');

	}

}
