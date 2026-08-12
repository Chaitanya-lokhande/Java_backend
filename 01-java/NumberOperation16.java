package chaitanyaLokhande;

public class NumberOperation16 {
	int maxNum;
	int sumNum;
	int counter;
	void printDivNumbers(int startRange, int endRange) {
		for (int count = startRange; count <= endRange; count++) {
			if(count%7 == 0) {
				System.out.println(count);
				maxNum = count;
				sumNum += count;
				counter += 1;
			}
		}
		System.out.println(maxNum + " is largest number divisible by 7 within the Range " + startRange + " and " + endRange);
		System.out.println("Sum of all numbers divisible by 7 is " + sumNum);
		System.out.println("Average of all numbers divisible by 7 is " + (sumNum/counter));
	}

	public static void main(String[] args) {
		NumberOperation16 numberOperation16 = new NumberOperation16();
		numberOperation16.printDivNumbers(10, 50);

	}

}
