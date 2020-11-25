package Assignment7;

import java.util.Scanner;

public class Question33 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter size of an array: ");
		int size = input.nextInt();
		
		int[] arr = new int[size];
		for (int i = 0; i  <arr.length; i++) {
			System.out.println("Enter elements: ");
			arr[i] = input.nextInt();
			
		}
		int temp = 0;
		for (int i = 0; i <arr.length; i++) {
			for (int j = i + 1; j <arr.length; j++) {
				if(arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					
				}
			}
		}
		for (int i = 0; i <arr.length; i++) {
			System.out.print(arr[i]+ " ," );
		}
		
		}
		}
