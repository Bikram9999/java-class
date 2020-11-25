package Assignment6MethodCall;

import java.util.Scanner;

public class Question20 {

	public static void findFourCalculator() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your choice: + - * /");
		char choice = input.next().charAt(0);

		int a = 0, b = 0, result = 0;

		if (choice == '+' || choice == '-' || choice == '*' || choice == '/') {
			System.out.println("Enter number 1: ");
			a = input.nextInt();
			System.out.println("Enter number 2: ");
			b = input.nextInt();

		}
		switch (choice) {
		case '+':
			result = a + b;
			System.out.println("Addition is: " + result);
			break;
		case '-':
			result = a - b;
			System.out.println("Subtraction is: " + result);
			break;
		case '*':
			result = a * b;
			System.out.println("Multiply is: " + result);
			break;
		case '/':
			result = a / b;
			System.out.println("Division is: " + result);
			break;
		default:
			System.out.println("wrong choice: ");
			break;

		}
	}

	public static void main(String[] args) {
		findFourCalculator();
	}
}
