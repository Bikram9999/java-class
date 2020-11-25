package Assignment3;

import java.util.Scanner;

public class Question9 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter of pounds: ");
		double p = input.nextDouble();
		
		// 1 pound = 0.454kg
		double kg = (p * 0.454);
		System.out.println("pounds into kg: " + kg);
		
		

	}

}
