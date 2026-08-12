package chaitanyaLokhande;

public class NumOperationReturnType {
	
	int firstNumberDivisible(int startRng, int endRng) {
		int ans = 0;
		for(int num = startRng; num <= endRng; num++) {
			if(num % 7 == 0) {
				ans = num;
				break;
			}
		}
		return ans;
	}
	
	int secondDivisibleNumber(int startRng, int endRng) {
		int ans = 0;
		int count = 0;
		for(int num = startRng; num <= endRng; num++) {
			if(num % 7 == 0) {
				ans = num;
				count++;
				if (count == 2) {
					break;
				}
			}
		}
		return ans;
	}
	
	int nthDivisibleNumber(int startRng, int endRng, int nth) {
		int ans = 0;
		int count = 0;
		for(int num = startRng; num <= endRng; num++) {
			if(num % 7 == 0) {
				ans = num;
				count++;
				if (count == nth) {
					break;
				}
			}
		}
		return ans;
	}
	
	int firstLastNumberDivisible(int startRng, int endRng) {
		int ans = 0;
		for(int num = endRng; num >= startRng; num--) {
			if(num % 7 == 0) {
				ans = num;
				break;
			}
		}
		return ans;
	}
	
	int secondLastDivisibleNumber(int startRng, int endRng) {
		int ans = 0;
		int count = 0;
		for(int num = endRng; num >= startRng; num--) {
			if(num % 7 == 0) {
				ans = num;
				count++;
				if (count == 2) {
					break;
				}
			}
		}
		return ans;
	}
	
	int nthLastDivisibleNumber(int startRng, int endRng, int nth) {
		int ans = 0;
		int count = 0;
		for(int num = endRng; num >= startRng; num--) {
			if(num % 7 == 0) {
				ans = num;
				count++;
				if (count == nth) {
					break;
				}
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		NumOperationReturnType numberOperationReturnType = new NumOperationReturnType();
		int firstAns = numberOperationReturnType.firstNumberDivisible(10, 20);
		System.out.println("First number divisible by 7 is " + firstAns);
		
		int secondAns = numberOperationReturnType.secondDivisibleNumber(10, 30);
		System.out.println("Second number divisible by 7 is " + secondAns);
		
		int firstNth = 11;
		int nthAns = numberOperationReturnType.nthDivisibleNumber(10, 100, firstNth);
		System.out.println(firstNth + "th number divisible by 7 is " + nthAns);
		
		int firstLastAns = numberOperationReturnType.firstLastNumberDivisible(10, 20);
		System.out.println("Last number divisible by 7 is " + firstLastAns);
		
		int secondLastAns = numberOperationReturnType.secondLastDivisibleNumber(10, 30);
		System.out.println("Second Last number divisible by 7 is " + secondLastAns);
		
		int lastNth = 10;
		int nthLastAns = numberOperationReturnType.nthLastDivisibleNumber(10, 100, lastNth);
		System.out.println(lastNth + "th Last number divisible by 7 is " + nthLastAns);
		
		
		

	}

}
