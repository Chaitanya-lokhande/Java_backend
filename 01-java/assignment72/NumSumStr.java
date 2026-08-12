package chaitanyaLokhande.assignment72;

public class NumSumStr {
	int getSumOfNumbersInString(String s) {
		String[] inputArr = s.split(" ");
		int sum = 0;
		for (int i = 0; i < inputArr.length; i++) {
			try {
				sum = sum + Integer.parseInt(inputArr[i]);
			} catch (NumberFormatException ne) {
				continue;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		NumSumStr numSum = new NumSumStr();
		String input = "i have 13 years and 6 months of experience and 2 years of experience as trainer.";
		int outSum = numSum.getSumOfNumbersInString(input);
		System.out.println("Sum is: " + outSum);
	}

}
