package chaitanyaLokhande;

import java.util.Scanner;

public class MaxNum {
	void getMaxNum(int a, int b, int c) {
		if(a > b && a > c) {
			System.out.println(a + " is a max number.");
		}else if(b > a && b > c) {
			System.out.println(b + " is a max number.");
		}else {
			System.out.println(c + " is a max number.");
		}
	}
	public static void main(String[] args) {
		MaxNum maxNum = new MaxNum();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter first Number: ");
		int a = scanner.nextInt();
		System.out.print("Enter second Number: ");
		int b = scanner.nextInt();
		System.out.print("Enter third Number: ");
		int c = scanner.nextInt();
		
		maxNum.getMaxNum(a, b, c);
		
	}
}
