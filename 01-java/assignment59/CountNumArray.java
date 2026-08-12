package chaitanyaLokhande.assignment59;

public class CountNumArray {
	int getCountOfNumArray(String[] inputArr) {
		int digitCount = 0;
		for(int index = 0; index < inputArr.length; index++) {
			String inputStr = inputArr[index];
			for(int i = 0; i < inputStr.length(); i++) {
				char ch = inputStr.charAt(i);
				if(Character.isDigit(ch)) {
					digitCount += 1;
				}
			}
		}
		return digitCount;
	}

	public static void main(String[] args) {
		CountNumArray countNum = new CountNumArray();
		String[] inputArr = {"tech1no", "c1re2d4i5ts", "t1ec3hn3oc3r4e5d5i5t8s9"};
		int digitCount = countNum.getCountOfNumArray(inputArr);
		System.out.println("Total number of digits in Array --> " + digitCount);
	}

}
