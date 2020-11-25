package Assignment4;

import java.util.Scanner;

public class Question17 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter year to calculate leap year: ");//2020
		int n = input.nextInt();
		
		if(n % 4 == 0) {
			System.out.println(n + " is a leap year. ");//divisible by even like 4 value
			
		}else {
			System.out.println(n + " is invalid leap year.");
		}
		System.out.println("More code: ");
		System.out.println("End: ");

	}

}
