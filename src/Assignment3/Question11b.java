package Assignment3;

import java.util.Scanner;

public class Question11b {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a: ");
		int a = input.nextInt();
		System.out.println("Enter b: ");
		int b = input.nextInt();
		System.out.println("Before swapping a is: " + a);//6
		System.out.println("Before swapping b is: " + b);//7
		
		a = a + b;//13
		b = a - b;//6
		a = a - b;//7
		
		System.out.println();
		System.out.println("After swapping a is: " + a);
		System.out.println("After swapping b is: " + b);
		
		
				
		

	}

}
