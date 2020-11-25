package Assignment7;

import java.util.Scanner;

public class Question34 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter  size of an array: ");
		int n = input.nextInt();
		
		int arr[] = new int[n];
		for (int i = 0; i <arr.length; i++) {
			System.out.println("Enter values of an array: ");
			arr[i] = input.nextInt();
		}
		System.out.print("Original number: ");
		for (int i = 0; i <arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.print("Reserve number: ");
		for (int i = (arr.length - 1); i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}

	}
}
