package day13;

import java.util.Scanner;

public class MethodDemo1 {
	
	//<access modifier> void <method name>
	public void sayHello() {
		System.out.println("hello from Kathmandu. ");
	
	}
	//<access modifier> void <method name>(no.of arguments/parameters)
	public void printInfo(String name, int age, String address) {
		System.out.println("Name is: " + name);
		System.out.println("Age is: " + age);
		System.out.println("Address is: " + address);
		
	}
	
	public static void main(String[] args) {
		MethodDemo1 obj = new MethodDemo1();
		obj.sayHello();
		
		//it is hardcore function
		String name = "Ram";
		int age = 22;
		String address = "Kathmandu";
		obj.printInfo(name, age, address);
		
		//by user
		Scanner input = new Scanner(System.in);
		System.out.println("Enter name: ");
		String name1 = input.next();
		System.out.println("Enter age: ");
		int age2 = input.nextInt();
		System.out.println("Enter address: ");
		String address3 = input.next();
		
		obj.printInfo(name1, age2, address3);
		
		
		
	}
	
	
	

}
