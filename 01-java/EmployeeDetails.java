//Assignment 3
package chaitanyaLokhande;
class EmployeeDetails{
	int empId;
	String empFirstName;
	String empLastName;
	int empSalary;
	
	void updateDetails(){
		empId = 123;
		empFirstName = "Chaitanya";
		empLastName = "Lokhande";
		empSalary = 5000;
	}
	
	void updateSalary(){
		empSalary = empSalary + 2000;
	}
	
	void printDetail(){
		System.out.println("Employee First name is " + empId);
		System.out.println("Employee First name is " + empFirstName);
		System.out.println("Employee Last name is " + empLastName);
		System.out.println("Employee current salary is " + empSalary);
	}
	
	public static void main(String[] args){
		EmployeeDetails employeeDetails = new EmployeeDetails();
		employeeDetails.updateDetails();
		employeeDetails.updateSalary();
		employeeDetails.printDetail();
	}
}