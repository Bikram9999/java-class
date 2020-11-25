package Assignment4;

import java.util.Scanner;

public class Question14 {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		 System.out.println("Enter value a: ");//5
		 int a = input.nextInt();
		 System.out.println("Enter value b: ");//8
		 int b = input.nextInt();
		 
		 if(a == b) {
			 System.out.println("a and b are equals: ");
			 
		 }
		 if(a < b) {
			 System.out.println("a is smaller than b: ");
			 
		 }
		 if(a > b) {
			 System.out.println("a is greater than b: ");
		 }
		 

	}

}
