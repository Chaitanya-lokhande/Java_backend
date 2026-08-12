package chaitanyaLokhande.assignment36;

public class StringAscii {
	void getStringDetails(String input){
		int uCount = 0;
		int lCount = 0;
		int dCount = 0;
		int sCount = 0;
		for(int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if(ch > 64 && ch < 90) {
				uCount += 1;
			}else if(ch > 96 && ch < 123) {
				lCount += 1;
			}else if(ch > 47 && ch < 58) {
				dCount += 1;
			}else {
				sCount += 1;
			}
		}
		System.out.println("Uppercase Count: " + uCount);
		System.out.println("Lowercase Count: " + lCount);
		System.out.println("Digit Count: " + dCount);
		System.out.println("Special Char Count: " + sCount);
		
	}

	public static void main(String[] args) {
		StringAscii stringAscii = new StringAscii();
		stringAscii.getStringDetails("Te2chn6o,cre-4di_T!s");
	}

}
