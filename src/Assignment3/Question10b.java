package Assignment3;

import java.util.Scanner;

public class Question10b {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter value of a: ");
		double a = input.nextDouble();
		System.out.println("Enter value of b: ");
		double b = input.nextDouble();
		System.out.println("Enter value of c: ");
		double c = input.nextDouble();
		
		
		double s = (a + b + c) / 2;
		
		double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
		System.out.println("area is: " + area);
		input.close();
		
		
		

	}

}
