package Assignment3;

import java.util.Scanner;

public class CelsiusDemo {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Celsius: ");
		double c = input.nextDouble();
		
		double f = (c * 9 / 5) + 32;
		System.out.println("Celsius to fahrenheit: " + f);

	}

}
