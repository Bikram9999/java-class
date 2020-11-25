package Assignment6MethodCall;

import java.util.Scanner;

public class Question19 {

	public static void findTriangle() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter side a: ");// 4
		int sideA = input.nextInt();
		System.out.println("Enter side b: ");// 4
		int sideB = input.nextInt();
		System.out.println("Enter side c: ");// 6
		int sideC = input.nextInt();

		if ((sideA == sideB) && (sideA == sideC)) {
			System.out.println("Is an equilateral triangle. ");

		} else if ((sideA == sideB) || (sideB == sideC) || (sideA == sideC)) {
			System.out.println("Is an isosceles triangle. ");

		} else {
			System.out.println("Is a scalene triangle. ");
		}

	}

	public static void main(String[] args) {
		findTriangle();// isosceles triangle

	}

}
