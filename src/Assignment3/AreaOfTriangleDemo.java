package Assignment3;

import java.util.Scanner;

public class AreaOfTriangleDemo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter height of triangle: ");
		double h = input.nextDouble();
		System.out.println("Enter base of triangle: ");
		double b = input.nextDouble();
		
		double a = (h * b) / 2;
		System.out.println("Area of triangle is: " + a );
		
		
		

	}

}
