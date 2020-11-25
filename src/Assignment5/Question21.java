package Assignment5;

import java.util.Scanner;

public class Question21 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your choice: ");
		int choice = input.nextInt();
		
		switch (choice) {
		
		case 1:
			System.out.println("This is Sunday. ");
			break;
		case 2:
			System.out.println("This is Monday. ");
			break;
		case 3:
			System.out.println("This is Tuesday. ");
			break;
		case 4:
		System.out.println("This is Wednesday. ");
		   break;
		case 5:
			System.out.println("This is Thursday. ");
//			break;
		case 6:
			System.out.println("This is Friday. ");
			break;
		case 7:
			System.out.println("This is saturday. ");
			break;
		default:
			System.out.println("Wrong week choice: ");
			break;
			
		}
		System.out.println("More n more code. ");
		System.out.println("End. ");

	}

}
