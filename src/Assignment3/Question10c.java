package Assignment3;

import java.util.Scanner;

public class Question10c {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter value of a: ");
		double a = input.nextDouble();
		System.out.println("Enter value of b: ");
		double b = input.nextDouble();
		System.out.println("Enter value of c: ");
		double c = input.nextDouble();
		
		double x = (-b + (Math.sqrt(b * b) - 4 * a * c)) / 2 * a;
		System.out.println(x);
		

	}

}
