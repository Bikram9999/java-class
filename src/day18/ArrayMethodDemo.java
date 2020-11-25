package day18;

import java.util.Scanner;

public class ArrayMethodDemo {

	//method call
	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		

	}
	public static int [] returnArray (Scanner input) {
		System.out.println("Enter size of an array: ");
		int size = input.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i<arr.length; i++) {
			System.out.println("Enter elements: ");
			arr[i] = input.nextInt();
		}
		return arr;
	}
	
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		int[] arr = returnArray(input);
		printArray(arr);
				
	}
	 

}
