package day23;

public class Student {
	
	private String name;
	private int roll;
	
	public Student(String n, int r) {
		name = n;
		roll = r;
		System.out.println("constructor called");
		
	}
	
	public void displayInfo() {
		System.out.println("Name is: " + name);
		System.out.println("Roll is: " + roll);
	}
	public static void main(String[] args) {
		Student obj1 = new Student("Ram", 32);
		obj1.displayInfo();
		
		System.out.println("=========");
		Student obj2 = new Student("Shyam", 45);
		obj2.displayInfo();
		
		
	}

}

//constructor: is a special method which has following properties
//1. It's name is same as class name
//2. it has no return type
//3. we cannot even use 'void' keyword
//4. it can have any access modifier
//5. it is mainly used to initialized member's data
//6. it runs only once for each object