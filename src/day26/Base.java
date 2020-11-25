package day26;

public class Base {
	
	public Base() {
		System.out.println("parent's default constructor..");
		
	}
	public Base(int a) {
		System.out.println("parent's arg constructor..");
	}
	
	String name = "parent's name";
	
	public void greet() {
		System.out.println("Hello, Namastey..");
	}
	
	public static void main(String[] args) {
		Base obj = new Base();
		System.out.println(obj.getClass());
		
	}

}
