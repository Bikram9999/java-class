package Assignment2;

import java.util.Scanner;

public class AverageDemo {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number1: ");
		int a = input.nextInt();
		System.out.println("Enter number2: ");
		int b = input.nextInt();
		int sum = a + b;
		System.out.println("Sum is: " +sum);
		
		
		double average = (double) sum/2;
		System.out.println("average is: " +average);

	}

}
