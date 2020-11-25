package day28_Interface;

import day29_polymorphism.AccessModifierDemo;

public class AccessChildOtherPackk extends AccessModifierDemo {
	
	public static void main(String[] args) {
		AccessModifierDemo obj = new AccessModifierDemo();
		//obj.defaultMethod();
		obj.publicMethod();
		//obj.protectedMethod();
		//obj.privateMethod();
		
		AccessChildOtherPackk obj1 = new AccessChildOtherPackk();
		obj1.protectedMethod();
		
	}

	
	

}
