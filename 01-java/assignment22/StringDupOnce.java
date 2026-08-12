package chaitanyaLokhande.assignment22;

public class StringDupOnce {
	String printDupOnce(String input) {
		String output = "";
		for(int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if(input.indexOf(ch) != input.lastIndexOf(ch)) {
				if(!output.contains(String.valueOf(ch))) {
					output = output + ch;
				}
			}
		}
		return output;
	}

	public static void main(String[] args) {
		StringDupOnce stringDupOnce = new StringDupOnce();
		String output = stringDupOnce.printDupOnce("technocreditst");
		System.out.println(output);
	}

}
