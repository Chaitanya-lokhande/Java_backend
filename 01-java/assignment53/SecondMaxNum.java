package chaitanyaLokhande.assignment53;

public class SecondMaxNum {
	int getSecondMaxNum(int[] inputArr) {
		int maxNum = Integer.MIN_VALUE;
		int secondMaxNum = Integer.MIN_VALUE;
		for(int index = 0; index < inputArr.length; index++) {
			if(inputArr[index] > maxNum) {
				secondMaxNum = maxNum;
				maxNum = inputArr[index];
			}else if(inputArr[index] > secondMaxNum && inputArr[index] != maxNum) {
				secondMaxNum = inputArr[index];
			}
		}
		return secondMaxNum;
		
	}

	public static void main(String[] args) {
		SecondMaxNum secondMaxNum = new SecondMaxNum();
		int[] input = {-90, -33, 0, 0, 0, 0};
		int ans = secondMaxNum.getSecondMaxNum(input);
		System.out.println("Second Max Number: " + ans);
		
		int[] input1 = {10, -33, 22, 45, -11, -89};
		int ans1 = secondMaxNum.getSecondMaxNum(input1);
		System.out.println("Second Max Number: " + ans1);
		
		int[] input2 = {90, -33, -22, 4, -2, 0};
		int ans2 = secondMaxNum.getSecondMaxNum(input2);
		System.out.println("Second Max Number: " + ans2);
	}

}
