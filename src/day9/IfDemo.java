package day9;

import java.util.Scanner;

//Question13
public class IfDemo {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number: ");
		int n = input.nextInt();
		
		if(n < 0) {
			System.out.println("You have entered negative: ");//if true it only comes out
			
		}
		
		System.out.println("more code");//if false it only comes out
		System.out.println("End");
		input.close();
		
		
		

	}

}
//Conditional statements
//1.simple if
//2.if else
//3.Nested if else
//4.else if

//switch-case