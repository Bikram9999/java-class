package Assignment3;

import java.util.Scanner;

public class Fahrenheitdemo {

	public static void main(String[] args) {
		// f to  Celsius , we want to know more about celsius
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter fahrenheit: ");
		double f = input.nextDouble();
		
		
		double c = (f - 32) * 5 / 9;
		System.out.println("Fahrenheit to celsius: " + c );
		
		
		
		
		
		
		

		

	}
}
