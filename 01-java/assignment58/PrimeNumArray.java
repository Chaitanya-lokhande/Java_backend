package chaitanyaLokhande.assignment58;

public class PrimeNumArray {
	void getPrimeNumbersFromArray(int[] inputArr) {
		for (int index = 0; index < inputArr.length; index++) {
			boolean flag = isNumPrime(inputArr[index]);
			if (flag) {
				System.out.println(inputArr[index] + " is a prime number");
			}
		}
	}

	boolean isNumPrime(int num) {
		int count = 0;
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				count++;
			}
			if (count > 0) {
				return false;
			}
		}
		if (count == 0)
			return true;
		else {
			return false;
		}
	}

	public static void main(String[] args) {
		PrimeNumArray primeNumArray = new PrimeNumArray();
		int[] input = { 10, 44, 33, 21, 13, 17, 66 };
		primeNumArray.getPrimeNumbersFromArray(input);

	}

}
