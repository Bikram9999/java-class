package Assignment3;

import java.util.Scanner;

public class VolumesOfCylinder {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter radius of cylinder: ");
		double r = input.nextDouble();
		System.out.println("Enter length/height of cylinder: ");
		double h = input.nextDouble();
		 
		double v = 3.14 * r * r * h;
		System.out.println("Volume of cylinder is: " + v);

	}

}
