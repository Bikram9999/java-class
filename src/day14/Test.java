package day14;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Demo obj = new Demo();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter choice: table|sum|reverse ");
		String choice = input.next();
		
		
		//switch case and calling method
		switch(choice) {
		case "table":
			System.out.println("Enter number to find table: ");
			int n = input.nextInt();
			obj.printTable(n);
			break;
			
		case "sum":
			System.out.println("Enter number to find nth sum: ");
			n = input.nextInt();
			obj.findNthSum(n);
			break;
			
		case "reverse":
			System.out.println("Enter number to find reverse: ");
			int originalNumber = input.nextInt();
			obj.reverseNumber(originalNumber);
			break;
			
		default:
			System.out.println("wrong choice: ");
			break;
		
		}
		
	}
	
}

