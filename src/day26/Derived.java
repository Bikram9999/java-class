package day26;

public class Derived extends Base {
	
	public Derived () {
		super(5);//it must be written first 
		System.out.println("Child's default constructor..");
	}
	
	public Derived(int a) {
		System.out.println("Child's arg constructor..");
	}
	
	String name = "Child's name ";
	
	
	public void greet() {
		System.out.println(name);
		System.out.println(super.name);
		System.out.println("Hey, Namastey..");
		super.greet();
		


}
}
