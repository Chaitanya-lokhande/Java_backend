package chaitanyaLokhande.assignment60;

public class CountNumString {
	int getCountOfNumArray(String[] inputArr) {
		int digitCount = 0;
		for(int index = 0; index < inputArr.length; index++) {
			getCountofNumString(inputArr[index]);
			
		}
		return digitCount;
	}
	void getCountofNumString(String inputStr) {
		String output = "";
		int digitCount = 0;
		for(int i = 0; i < inputStr.length(); i++) {
			char ch = inputStr.charAt(i);
			if(Character.isDigit(ch)) {
				digitCount += 1;
			}else{
				output = output + ch;
			}
		}
		System.out.println(output + " -> " + digitCount);
	}

	public static void main(String[] args) {
		CountNumString countString = new CountNumString();
		String[] inputArr = {"tech1no", "c1re2d4i5ts", "t1ec3hn3oc3r4e5d5i5t8s9"};
		countString.getCountOfNumArray(inputArr);
		
	}

}
