package chaitanyaLokhande;

public class ArrayDigit {
	
	String getFirstNameWithDigit(String[] arr) {
		for(int index = 0; index < arr.length; index++) {
			boolean check = isDigitInString(arr[index]);
			if(check) {
				return arr[index];
			}
		}
		return "No digit in given array";
	}
	
	boolean isDigitInString(String input) {
		for(int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if(Character.isDigit(ch)) {
				return true;
			}
		}
		return false;
		
	}

	public static void main(String[] args) {
		ArrayDigit arrayDigit = new ArrayDigit();
		String[] input = {"Hello", "Technocredits","P7une","I2ndi3a"};
		String ans = arrayDigit.getFirstNameWithDigit(input);
		System.out.println(ans);
	}

}
