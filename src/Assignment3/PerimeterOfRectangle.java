package Assignment3;

import java.util.Scanner;

public class PerimeterOfRectangle {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter length of rectangle: ");
		double l = input.nextDouble();
		System.out.println("Enter width of rectangle: ");
		double w = input.nextDouble();
		
		double p = 2 * (l + w);
		System.out.println("Perimeter of rectangle: " + p);
		
		

	}

}
