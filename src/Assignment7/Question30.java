package Assignment7;

import java.util.Scanner;

public class Question30 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number to find fibonacci: ");//5
		int n = input.nextInt();
		
		int previous = 1;
		int next = 1;
		
		System.out.print(previous + " ");
		for (int i = 1; i <= n; i++) {
			System.out.print(next + " ");
			int temp = previous + next;
			previous = next;
			next = temp;
			
		}
		input.close();
		
		

	}

}
