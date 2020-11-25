package day8;

import java.util.Scanner;

public class Question11aPractice {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a: ");
		double a = input.nextDouble();
		System.out.println("Enter b: ");
		double b = input.nextDouble();
		System.out.println("Before swapping a is: " + a);//5
		System.out.println("Before swapping b is: " + b);//6
		
		double temp = a;
		a = b;
		b = temp;
		
		System.out.println();
		System.out.println("After swapping a is: " + a);
		System.out.println("After swapping b is: " + b);
		
				
		

	}

}
