package day8;

import java.util.Scanner;

public class InputDemo {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter float: ");
		float f = input.nextFloat();
		System.out.println("Enter any character: ");
		char c = input.next().charAt(0);
		System.out.println("Enter byte number: ");
		byte b = input.nextByte();
		System.out.println("Enter short number: ");
		short s = input.nextShort();
		System.out.println("Enter long number: ");
		long l = input.nextLong();
		System.out.println("Enter boolean value: ");
		boolean bb = input.nextBoolean();
		
		System.out.println("Float value is: " + f);
		System.out.println("Char value is: " + c); 
		System.out.println("Byte value is: " + b);
		System.out.println("Short value is: " + s);
		System.out.println("Long value is: " + l);
		System.out.println("Boolean value is: " + bb);
		

	}

}
