package Assignment3;

import java.util.Scanner;

public class Question11a {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a: ");
		double a = input.nextDouble();
		System.out.println("Enter b: ");
		double b = input.nextDouble();
		System.out.println("Before swapping a is: " + a);
		System.out.println("Before swapping b is: " + b);
		
		double temp = a;
		a = b;
		b = temp;
		System.out.println();
		System.out.println("After swapping a is: " + a);
		System.out.println("After swapping b is: " + b);
		
		

	}

}
