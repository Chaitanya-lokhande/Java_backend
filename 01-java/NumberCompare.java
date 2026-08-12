//Assignment 13
package chaitanyaLokhande;

public class NumberCompare {
	void findBiggerNumber(int num1,int num2) {
		if(num1 > num2) {
			System.out.println(num1 + " is bigger from " + num1 +" and " + num2);
		}else {
			System.out.println(num2 + " is bigger from " + num1 +" and " + num2);
		}
	}
	void findSmallerNumber(int num1,int num2) {
		if(num1 < num2) {
			System.out.println(num1 + " is smaller from " + num1 +" and " + num2);
		}else {
			System.out.println(num2 + " is smaller from " + num1 +" and " + num2);
		}
	}

	public static void main(String[] args) {
		NumberCompare numberCompare = new NumberCompare();
		numberCompare.findBiggerNumber(17, 10);
		numberCompare.findSmallerNumber(17, 10);
	}

}

