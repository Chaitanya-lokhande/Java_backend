//Assignment 14
package chaitanyaLokhande;

public class EvenNumberPara {
	void findEvenNumber(int start, int end) {
		System.out.println("Even numbers are:");
		for(int count = start; count <= end; count++) {
			if(count%2 == 0) {
				System.out.println(count);
			}
		}
	}

	public static void main(String[] args) {
		EvenNumberPara evenNumberPara = new EvenNumberPara();
		evenNumberPara.findEvenNumber(10, 20);
	}

}
