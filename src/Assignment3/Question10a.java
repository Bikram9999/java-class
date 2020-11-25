package Assignment3;

import java.util.Scanner;

public class Question10a {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter value of a: ");
		double a = input.nextDouble();
		System.out.println("Enter value of t: ");
		double t = input.nextDouble();
		System.out.println("Enter value of u: ");
		double u = input.nextDouble();
		
		double s = ((u * t) + 0.5 * (a * t * t));//s = semisphier
		System.out.println("semipier of s: " + s);
		
	}

}
