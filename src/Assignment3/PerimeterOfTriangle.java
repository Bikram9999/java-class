package Assignment3;

import java.util.Scanner;

public class PerimeterOfTriangle {
//Que.6:
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		System.out.println("Enter sides of a:  ");
		double a = input.nextDouble();
		System.out.println("Enter sides of b: ");
		double b = input.nextDouble();
		System.out.println("Enter sides of c: ");
		double c = input.nextDouble();
		
		double p = a + b + c;
		System.out.println("Perimeter of triangle: " + p);
		

	}

}
