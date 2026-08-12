package chaitanyaLokhande.assignment69;

public class PatternPrint2 {
	static void printAlphaPattern(int rows) {
		for (int i = 1; i <= rows; i++) {
			char ch = 'A';
			for (int j = 1; j <= i; j++) {
				System.out.print(ch + " ");
				ch++;
			}
			System.out.println("");
		}
	}
	
	static void printAlphaPattern2(int rows) {
		char ch = 'A';
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(ch + " ");
				ch++;
			}
			System.out.println("");
		}
	}
	
	static void printAlphaPattern3(int rows) {
		for (int i = 1; i <= rows; i++) {
			char ch = 'A';
			for (int j = 1; j <= i; j++) {
				System.out.print(ch);
				char ch2 = (char) (ch + 32);
				System.out.print(ch2 + " ");
				ch++;
			}
			System.out.println("");
		}
	}
	
	static void printSymPattern(int size, char start) {
		int flag = 0;
		if(start == '$') {
			flag = 1;
		}
		for (int i = 1; i <= size; i++) {
			for (int j = 1; j <= size; j++) {
				if(flag == 0) {
					System.out.print('#'+ " ");
					flag++;
				}
				else {
					System.out.print('$'+ " ");
					flag--;
				}
			}
		System.out.println("");
		}
	}

	public static void main(String[] args) {
		PatternPrint2.printAlphaPattern(5);
		System.out.println("");
		PatternPrint2.printAlphaPattern2(5);
		System.out.println("");
		PatternPrint2.printAlphaPattern3(5);
		System.out.println("");
		PatternPrint2.printSymPattern(5,'$');
	}

}
;