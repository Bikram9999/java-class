package day29_polymorphism;

public class AccessModifierDemo {
	
	String defaultVar = "this is default variable";
	public String publicVar = "this is public variable";
	private String privateVar = "this is private variable";
	protected String protectedVar = "this is protected variable";
	
	void defaultMethod() {
		System.out.println("this is default method..");
	}
	public void publicMethod() {
		System.out.println("this is public method..");
	}
	private void privateMethod() {
		System.out.println("this is private method..");
	}
	protected void protectedMethod() {
		System.out.println("this is protected method..");
	}
	public AccessModifierDemo() {
		System.out.println("this public level access constructor.");
	}
	AccessModifierDemo(int a) {
		System.out.println("this default level access constructor.");
	}
	protected AccessModifierDemo(String s) {
		System.out.println("this protected level access constructor.");
	}
	private AccessModifierDemo(double d) {
		System.out.println("this is private level access constructor.");
	}
	public static void main(String[] args) {
		AccessModifierDemo obj = new AccessModifierDemo(4.5);
		obj.defaultMethod();
		obj.publicMethod();
		obj.protectedMethod();
		obj.privateMethod();
		
	}

}
