package chaitanyaLokhande.assignment68;

public class PrintPattern {
	static void printStarPattern(int rows) {
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}

	static void printNumPattern(int rows) {
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println("");
		}
	}

	static void printNumPattern2(int rows) {
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i + " ");
			}
			System.out.println("");
		}
	}

	static void printRevNumPattern(int rows) {
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println("");
		}
	}

	static void printNumPattern3(int rows) {
		int count = 1;
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(count + " ");
				count++;
			}
			System.out.println("");
		}
	}

	static void printAltNumPattern(int rows) {
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= i; j++) {
				if (j % 2 == 0) {
					System.out.print("1 ");
				} else {
					System.out.print("0 ");
				}
			}
			System.out.println("");
		}
	}
	
	static void printAltNumPattern2(int rows) {
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= i; j++) {
				if(i % 2 == 0) {
					if (j % 2 == 0) {
						System.out.print("0 ");
					} else {
						System.out.print("1 ");
					}
				}else {
					if (j % 2 == 0) {
						System.out.print("1 ");
					} else {
						System.out.print("0 ");
					}
				}
				
			}
			System.out.println("");
		}
	}

	public static void main(String[] args) {
		PrintPattern.printStarPattern(5);
		System.out.println("");
		PrintPattern.printNumPattern(5);
		System.out.println("");
		PrintPattern.printNumPattern2(5);
		System.out.println("");
		PrintPattern.printRevNumPattern(5);
		System.out.println("");
		PrintPattern.printNumPattern3(4);
		System.out.println("");
		PrintPattern.printAltNumPattern(5);
		System.out.println("");
		PrintPattern.printAltNumPattern2(5);
	}

}
