package Assignment4;

import java.util.Scanner;

public class Question16 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number to find even or odd: ");
		int n = input.nextInt();
		
		if (n % 2 == 0) {
			System.out.println(n + " is an even number. ");
			
		}else {
			System.out.println(n + " is an odd number. ");
		}
		System.out.println("More code: ");
		System.out.println("End: ");
		

	}
	


}
