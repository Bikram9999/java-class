package day8;

import java.util.Scanner;

public class Que11bPractice {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter value a: ");
		double a = input.nextDouble();
		System.out.println("Enter value b: ");
		double b = input.nextDouble();
		System.out.println("Before swapping a is: " + a);//7
		System.out.println("Before swapping b is: " + b);//8
		
		 a = a + b;//15
		 b = a - b;//7
		 a = a - b;//8
		 
		 System.out.println();
		 System.out.println("After swapping a is: " + a);
		 System.out.println("After swapping b is: " + b);
		
		
				
		
		

	}

}
