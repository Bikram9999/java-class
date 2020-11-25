package day24;

public class ThisDemo1 {
	
	//instance variable
	private String name;
	private int age;
	
	//non static method
	public void assignValue(String name, int age) {//local variable
		this.name = name;//if local variable&instance variable name is same
	    this.age = age;//then we use this...
	}
	public void display() {
		System.out.println("Name is: " + name);
		System.out.println("Age is: " + age);
	}
	

	

	public static void main(String[] args) {
		
		ThisDemo1 obj1 = new ThisDemo1();
		obj1.assignValue("Alex", 12);
		
		obj1.display();

	}

}
