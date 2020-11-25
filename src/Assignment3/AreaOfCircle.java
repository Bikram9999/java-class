package Assignment3;

import java.util.Scanner;

public class AreaOfCircle {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter radius of circle: ");
		double r = input.nextDouble();
		
		double a = 3.14 * ( r * r);
		System.out.println("Area of circle is: " + a);
		
		

	}

}
