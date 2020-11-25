package Assignment7;

import java.util.Scanner;

public class Question36 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter size of an array: ");
		int size = input.nextInt();
		
		int[] arr = new int[size];
		for (int i = 0; i <arr.length; i++) {
			System.out.println("Enter an element: ");
			arr[i] = input.nextInt();
			
		}
		//main logic
		System.out.println("Duplicate elements: ");
		int count = 0;
		for (int i = 0; i <arr.length; i++) {
			for (int j = i + 1; j <arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.println(arr[j] + " ");
					
				}
			}
		}
		if (count == 0) {
			System.out.println("Not duplicate elements found: ");
		}
		input.close();

	}

}
