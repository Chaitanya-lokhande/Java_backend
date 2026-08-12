//Assignment 12
package chaitanyaLokhande;
class ForLoopEg{
	void printName(){
		for(int count = 1; count <= 10; count++){
			System.out.println("Chaitanya - " + count);
		}
	}
	
	public static void main(String[] args){
		ForLoopEg forLoopEg = new ForLoopEg();
		forLoopEg.printName();
	}
}