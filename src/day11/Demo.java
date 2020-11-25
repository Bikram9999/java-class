package day11;

import java.util.Scanner;

public class Demo {
	
	//method declaration(definition)
	public static void findEvenOrOdd() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter to find an even or odd number: ");// it is call from main method
		int n = input.nextInt();
		
		if(n % 2 == 0) {
			System.out.println(n + " is an even number. ");
		}else {
			System.out.println(n + " is an odd number. ");
		}
		input.close();
	}

	public static void main(String[] args) {//main method
		findEvenOrOdd();

		}
				

	}


