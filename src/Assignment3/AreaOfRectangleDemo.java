package Assignment3;

import java.util.Scanner;

public class AreaOfRectangleDemo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter width: ");
		double w = input.nextDouble();
		System.out.println("Enter length: ");
		double l = input.nextDouble();
		
		
		double a = w * l;
		System.out.println("Area of rectangle is: " + a);
		
		


	}

}
