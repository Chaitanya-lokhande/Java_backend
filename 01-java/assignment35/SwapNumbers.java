package chaitanyaLokhande.assignment35;

public class SwapNumbers {
	
	void swapNumber(int a,int b) {
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("a: " + a + "; b: " + b + ";");
	}

	public static void main(String[] args) {
		SwapNumbers swapNumbers = new SwapNumbers();
		swapNumbers.swapNumber(10, 20);
	}

}
