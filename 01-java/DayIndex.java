//Assignment 11
package chaitanyaLokhande;
class DayIndex{
	void checkDayIndex(int dayIndex){
		if(dayIndex>=1 && dayIndex<=7){
			if(dayIndex>=1 && dayIndex<=5){
				System.out.println("Its a Weekday!!");
				if(dayIndex == 1){
					System.out.println("Monday");
				}else if(dayIndex == 2){
					System.out.println("Tuesday");
				}else if(dayIndex == 3){
					System.out.println("Wednesday");
				}else if(dayIndex == 4){
					System.out.println("Thursday");
				}else if(dayIndex == 5){
					System.out.println("Friday");
				}
			}else{
				System.out.println("Its a Weekend!!! Enjoy!!");
				if(dayIndex == 6){
					System.out.println("Saturday");
				}else{
					System.out.println("Sunday");
				}
			}
		}else{
			System.out.println("Invalid Day Index. Day Index should be in between 1 to 7");
		}
	}
	
	public static void main(String[] args){
		DayIndex dayIndex = new DayIndex();
		dayIndex.checkDayIndex(1);
		dayIndex.checkDayIndex(2);
		dayIndex.checkDayIndex(3);
		dayIndex.checkDayIndex(4);
		dayIndex.checkDayIndex(5);
		dayIndex.checkDayIndex(6);
		dayIndex.checkDayIndex(7);
		dayIndex.checkDayIndex(0);
		dayIndex.checkDayIndex(8);
		dayIndex.checkDayIndex(-7);
	}
}