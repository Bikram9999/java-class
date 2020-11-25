package day10;

import java.util.Scanner;

public class SwitchCaseDemo1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your choice: ");
		int choice = input.nextInt();
		
		switch(choice) {//start here
		
		case 1:
			System.out.println("This is addition. ");
			break;
		case 2:
			System.out.println("This is subtraction. ");
			break;
		case 3:
			System.out.println("This is multiplication. ");
			break;
		case 4:
			System.out.println("This is division. ");
			break;
		default:
			System.out.println("wrong choice. ");
			break;
			
		}// end here
		
		System.out.println("More code. ");
		System.out.println("End. ");
		
		

	}

}
