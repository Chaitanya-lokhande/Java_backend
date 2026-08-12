//Assignment 4
package chaitanyaLokhande;
class EmployeeDetails4{
	String firstName;
	String lastName;
	int empId;
	int managerId;
	String address;
	String phoneNumber;
	
	void updatePrimaryInfo(){
		firstName = "Chaitanya";
		lastName = "Lokhande";
		empId = 345;
		managerId = 90909;
	}
	
	void updateSecondaryInfo(){
		address = "Pune";
		phoneNumber = "+91-9325844471";
	}
	
	void displayPrimaryInfo(){
		System.out.println("Employee first name is " + firstName);
		System.out.println("Employee last name is " + lastName);
		System.out.println("Employee ID is " + empId);
		System.out.println("Manager ID is " + managerId);
	}
	
	void displayOtherInfo(){
		System.out.println("Employee address is " + address);
		System.out.println("Employee contact is " + phoneNumber);
	}
	
	void displayAllInfo(){
		System.out.println("Employee first name is " + firstName);
		System.out.println("Employee last name is " + lastName);
		System.out.println("Employee ID is " + empId);
		System.out.println("Manager ID is " + managerId);
		System.out.println("Employee address is " + address);
		System.out.println("Employee contact is " + phoneNumber);
	}
	
	public static void main(String[] args){
		EmployeeDetails4 employeeDetails = new EmployeeDetails4();
		employeeDetails.updatePrimaryInfo();
		employeeDetails.updateSecondaryInfo();
		employeeDetails.displayPrimaryInfo();
		employeeDetails.displayOtherInfo();
		employeeDetails.displayAllInfo();		
	}
}