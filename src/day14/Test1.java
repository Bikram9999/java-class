package day14;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Demo obj = new Demo();
		
		Scanner input = new Scanner(System.in);//just put outside
		String decision = " ";
		
		//do-while looping
		do {
			//to ask
			System.out.println("Enter choice: table|sum|reverse ");
			String choice = input.next();
			
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
			System.out.println("Do you still want to continue? enter yes|no ");
			decision = input.next();

	}while(decision.equalsIgnoreCase("yes"));
		System.out.println("bye byee byee!!!Happy coding");
		
	}
}
