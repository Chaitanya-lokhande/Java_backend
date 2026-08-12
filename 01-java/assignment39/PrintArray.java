package chaitanyaLokhande.assignment39;

public class PrintArray {
	void printArrayElements(String[] input) {
		for(int index = 0; index < input.length; index++) {
			System.out.println(input[index]);
		}
	}
	
	public static void main(String[] args) {
		PrintArray printArray = new PrintArray();
		String[] arr = {"techno", "technocredits", "aaryahi"};
		printArray.printArrayElements(arr);
	}
}
