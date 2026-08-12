package chaitanyaLokhande.assignment73;

import java.util.ArrayList;
import java.util.Scanner;

public class ValidNumInput {
	boolean isNumValid(String input) {
		int validNum = 0;
		try {
			validNum = Integer.parseInt(input);
		}catch(NumberFormatException ne) {
			return false;
		}
		return true;
	}
	
	ArrayList<Integer> getValidNum(int k){
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> outputList = new ArrayList<Integer>();
		int count = 1;
		while(count <= k) {
			System.out.print("Enter value : ");
			String userInput = scanner.next();
			if(isNumValid(userInput)) {
				outputList.add(Integer.parseInt(userInput));
				count++;
			}
		}
		return outputList;
		
	}

	public static void main(String[] args) {
		ValidNumInput validNumInput = new ValidNumInput();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number of valid inputs you want : ");
		int inputVal = scanner.nextInt();
		ArrayList<Integer> output = validNumInput.getValidNum(inputVal);
		System.out.println("Valid Input are : " + output);

	}

}
