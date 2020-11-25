package day13;

public class Demo {
	
	String nonStaticVar = "this is non-static variable";
	static String StaticVar = "this is static variable";
	
	//non-static method
	public void sayHello () {
		System.out.println("Hello, from Nepal. ");
	}
	
	//static method
	public static void sayHi() {
		System.out.println("Hi from USA. ");
		
	}
	
	public static void main(String[] args) {
		Demo obj = new Demo();
		obj.sayHello();
		System.out.println(obj.nonStaticVar);
		
		
		Demo.sayHi();//best practice
		System.out.println(Demo.StaticVar);
	}

}
