package day28_Interface;

import day29_polymorphism.AccessModifierDemo;

public class AccessOtherPackage {
	
	public static void main(String[] args) {
		AccessModifierDemo obj = new AccessModifierDemo();
		//obj.defaultMethod();
		obj.publicMethod();
		//obj.protectedMethod();
		//obj.privateMethod();
		
	}


}
