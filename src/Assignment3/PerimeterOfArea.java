package Assignment3;

import java.util.Scanner;

public class PerimeterOfArea {

	private static final String PI = null;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter radius of circle: ");
		double r = input.nextDouble();
		
		double p = 2 * 3.14 * r;
		System.out.println("Perimeter of area is: " + p);

	}

}
