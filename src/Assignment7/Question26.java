package Assignment7;

import java.util.Scanner;

public class Question26 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number: ");//123
		int originalNumber = input.nextInt();
		
		int reverseNumber = 0;
		
		System.out.println("Original number is: " + originalNumber);
		//logic
		while(originalNumber != 0) {
			int temp = originalNumber % 10;
			reverseNumber = reverseNumber * 10 + temp;
			originalNumber = originalNumber / 10;
			
		}
		System.out.println("Reverse number is: " + reverseNumber);
		input.close();
		
	}

}
