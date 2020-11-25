package day27_AbstractClass;

public abstract class Shape {
	
	//this is method
	abstract void draw();//if not given body //method
	//it has no body
	
	public void paint() {
		System.out.println("Shape is painted..");
	}
	
	public Shape() {
		System.out.println("Shape is constructor..");
	}

}
