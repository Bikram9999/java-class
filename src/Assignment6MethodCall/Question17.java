package Assignment6MethodCall;

import java.util.Scanner;

public class Question17 {

	public static void calculateLeapYear() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter year to calculate leap year: ");
		int n = input.nextInt();

		if (n % 4 == 0) {
			System.out.println(n + " is a valid leap year. ");
		} else {
			System.out.println(n + " is a invaliid leap year. ");
		}

	}

	public static void main(String[] args) {
		calculateLeapYear();

	}

}
