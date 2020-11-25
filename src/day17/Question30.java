package day17;

import java.util.Scanner;

public class Question30 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number to find fibonacci: ");
		int n = input.nextInt();//fibonacci means adding of next & previous number
		
		int first = 1;
		int second = 1;
		
		//main logic imp.
		System.out.println(first + " ");
		for (int i = 1; i <= n; i++) {
			System.out.println(second + " ");
			int temp = first + second;
			first = second;
			second = temp;
		}
		
		

	}

}
