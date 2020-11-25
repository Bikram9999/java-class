package Assignment5;

import java.util.Scanner;

public class Question20 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your choice: + - * / ");
		char choice = input.next().charAt(0);
		
		int a = 0, b = 0, result = 0;
		
		if (choice == '+' || choice == '-' || choice == '*' || choice == '/') {
			System.out.println("Enter number1: ");
			a = input.nextInt();
			System.out.println("Enter number2: ");
			b = input.nextInt();
			
		}
		switch(choice) {
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
			System.out.println("Multiplication is: " +result);
			break;
		case '/':
			result = a / b;
			System.out.println("Division is: " + result);
			break;
		default:
			System.out.println("Wrong choice: ");
			break;
			
		}
		
		
				

	}

}
