package Assignment5;

import java.util.Scanner;

public class Question16 {

	public static void findEvenOrOdd() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter to find an even or odd number: ");
		int n = input.nextInt();

		if (n % 2 == 0) {
			System.out.println(n + " is an even number. ");
		} else {
			System.out.println(n + " is an odd number. ");
		}
	}

	public static void main(String[] args) {
		findEvenOrOdd();

	}

}
