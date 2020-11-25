package day9;

import java.util.Scanner;

public class IfElseDemo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number to find even or odd: ");
		int n = input.nextInt();
		
		if (n % 2 == 0) {//true
			System.out.println(n + " is an even number. ");
		}else {//false
			System.out.println(n + " is an odd number. ");
		}
		
		System.out.println("More code: ");//just for knowing
		System.out.println("End: ");
		
		
		

	}

}
