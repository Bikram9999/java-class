package day27_AbstractClass;

//1.we cannot inherit(extends) final class
public /*final */ class FinalClassDemo {
	
	//3.if we use final on variable then it becomes constant
	final int a = 5;
	
	//2.we cannot override final method
	public /*final*/ void greet() {
		System.out.println("Hello,good morning..");
	}
	
	//4.we cannot use final keywords on constructor
	public /*final*/ FinalClassDemo() {
		
	}

}
