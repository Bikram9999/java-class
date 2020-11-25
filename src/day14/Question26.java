package day14;

import java.util.Scanner;

public class Question26 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number: ");
		int originalNumber = input.nextInt();//456
		
		int reverseNumber = 0;
		
		System.out.println("original number is: " + originalNumber);
		while(originalNumber != 0) {
			int temp = originalNumber % 10;//remainder
			reverseNumber = reverseNumber * 10 + temp;
			originalNumber = originalNumber/10;//quotient
			
		}
		
		System.out.println("Reverse number is: " + reverseNumber );
		input.close();
		

	}

}
