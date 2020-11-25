package Assignment7;

import java.util.Scanner;

public class Question29 {

	public static void main(String[] args) {

		Question28a ob = new Question28a();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number: ");
		int n = input.nextInt();

		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum = sum + (i / ob.findFactorial(i));
		}
		System.out.println("Sum of series is: " + sum);

	}
	
}
