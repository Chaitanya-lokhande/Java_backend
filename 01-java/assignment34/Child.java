package chaitanyaLokhande.assignment34;

public class Child extends Parent{
	
	int y = 100;
	int z = 110;
	
	void method2() {
		System.out.println("C.method2");
	}
	
	void method3() {
		System.out.println("C.method3");
	}
	

	public static void main(String[] args) {
		
		/*******case 1**********/
		System.out.println("Case 1: ");
		Parent parent1 = new Parent();
		System.out.println(parent1.x);
		System.out.println(parent1.y);
		//System.out.println(parent1.z); CE: Parent class cannot access the variables from child
		
		parent1.method1();
		parent1.method2();
		//parent1.method3(); CE: Parent class cannot access methods of child class.
		
		/*******case 2**********/
		System.out.println("Case 2: ");
		Child child1 = new Child(); //child1 will access all default protected and public variables of Parent class.
		System.out.println(child1.x);
		System.out.println(child1.y);
		System.out.println(child1.z);
		
		child1.method1();
		child1.method2();
		child1.method3();
		
		/*******case 3**********/
		System.out.println("Case 3: ");
		Parent parent2 = new Child();
		System.out.println(parent2.x);
		System.out.println(parent2.y); //Variables are not changed during runtime hence it will take value from parent class only behavior is changed.
		//System.out.println(p1.z); //In this p1.z is not checked by compiler as object is created taking reference of parent class.
		
		parent2.method1();
		parent2.method2(); //This is the case of dynamic polymorphism where the compiler takes the guarantee from parent class but at runtime shows the behavior of child class.
		//parent2.method3(); //This method will not be seen by compiler as it takes guarantee of only parent class.
		
		/*******case 4**********/
		System.out.println("Case 4: ");
		//Child child2 = new Parent() // Class cast exception, Cannot store parent in child.
		
		/*******case 5**********/
		System.out.println("Case 5: ");
		Parent parent3 = new Child();
		Parent child3 = new Parent();
		parent3 = child3; // This gives Case 1 condition : Parent p = new Parent();
		
		System.out.println(parent3.x);
		System.out.println(parent3.y);
		//System.out.println(parent3.z); //As in case 1
		
		parent3.method1();
		parent3.method2();
		//parent3.method3();// As in case 3
						
	}

}
