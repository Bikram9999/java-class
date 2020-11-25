package Assignment7;

import java.util.Scanner;

public class Question24 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number to print factorial: ");
		int n = input.nextInt();
		
		int fact = 1;
		for(int i = 1; i <= n; i++) {
			fact = fact * i;
			
		}
		System.out.println("Factorial number is: " + fact);
		input.close();
		

	}

}
