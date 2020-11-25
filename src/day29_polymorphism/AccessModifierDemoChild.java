package day29_polymorphism;

public class AccessModifierDemoChild extends AccessModifierDemo {
	
	public static void main(String[] args) {
		AccessModifierDemo obj = new AccessModifierDemo(4);
		obj.defaultMethod();
		obj.publicMethod();
		obj.protectedMethod();
		//obj.privateMethod();
		
	}


}
