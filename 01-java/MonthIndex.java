//Assignment 10
package chaitanyaLokhande;
class MonthIndex{
	void checkMonth(int index){
		if(index > 0 && index <= 12){
			if(index > 0 && index <= 3){
				if(index == 1){
					System.out.println("Month index 1 is in Q1. Its January!");
				}else if(index == 2){
					System.out.println("Month index 2 is in Q1. Its February!");
				}else{
					System.out.println("Month index 3 is in Q1. Its March!");
				}
			}else if(index > 3 && index <= 6){
				if(index == 4){
					System.out.println("Month index 4 is in Q2. Its April!");
				}else if(index == 5){
					System.out.println("Month index 5 is in Q2. Its May!");
				}else{
					System.out.println("Month index 6 is in Q2. Its June!");
				}
			}else if(index > 6 && index <= 9){
				if(index == 7){
					System.out.println("Month index 7 is in Q3. Its July!");
				}else if(index == 8){
					System.out.println("Month index 8 is in Q3. Its August!");
				}else{
					System.out.println("Month index 9 is in Q3. Its Sepetember!");
				}
			}else{
				if(index == 10){
					System.out.println("Month index 10 is in Q4. Its October!");
				}else if(index == 11){
					System.out.println("Month index 11 is in Q4. Its November!");
				}else{
					System.out.println("Month index 12 is in Q4. Its December!");
				}
			}
		}else{
			System.out.println("Month index " + index + " is Invalid. Try between 1 to 12");
		}
	}
	public static void main(String[] args){
		MonthIndex monthIndex = new MonthIndex();
		monthIndex.checkMonth(2);
		monthIndex.checkMonth(4);
		monthIndex.checkMonth(9);
		monthIndex.checkMonth(11);
		monthIndex.checkMonth(21);
		monthIndex.checkMonth(-2);
	}
}