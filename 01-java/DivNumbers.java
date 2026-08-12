//Assignment 15
package chaitanyaLokhande;

public class DivNumbers {
	void findDivNumbers(int start, int end) {
		System.out.println("Numbers divisible by 3 and 5 are:");
		for(int count = start; count <= end; count++) {
			if(count%3 ==0 && count%5 == 0) {
				System.out.println(count);
			}
		}
	}

	public static void main(String[] args) {
		DivNumbers divNumbers = new DivNumbers();
		divNumbers.findDivNumbers(5, 40);

	}

}
