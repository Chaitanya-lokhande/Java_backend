//Assignment 9
package chaitanyaLokhande;
class StudentMarks{
	void checkResult(int mark){
		if(mark > 90 && mark <= 100){
			System.out.println("Your score is : " + mark);
			System.out.println("Grade is A+");
		}
		else if(mark > 80 && mark <= 90){
			System.out.println("Your score is : " + mark);
			System.out.println("Grade is A");
		}
		else if(mark > 70 && mark <= 80){
			System.out.println("Your score is : " + mark);
			System.out.println("Grade is B+");
		}
		else if(mark > 60 && mark <= 70){
			System.out.println("Your score is : " + mark);
			System.out.println("Grade is B");
		}
		else if(mark > 50 && mark <= 60){
			System.out.println("Your score is : " + mark);
			System.out.println("Grade is C");
		}
		else if(mark < 50 && mark >= 0){
			System.out.println("Your score is : " + mark);
			System.out.println("Fail! Work Hard!");
		}
		else{
			System.out.println("Your entered : " + mark);
			System.out.println("Invalid Score! Score must be between 0 to 100.");
		}
	}
	
	public static void main(String[] args){
		StudentMarks studentMarks = new StudentMarks();
		studentMarks.checkResult(92);
		studentMarks.checkResult(76);
		studentMarks.checkResult(23);
		studentMarks.checkResult(65);
		studentMarks.checkResult(-55);
		studentMarks.checkResult(102);
	}
}