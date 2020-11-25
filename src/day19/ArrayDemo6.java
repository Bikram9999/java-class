package day19;

import java.util.Scanner;

public class ArrayDemo6 {

	public static void main(String[] args) {
		
		final int Row = 3;
		final int Column = 3;
		
		int [][] arr = new int[Row][Column];
		
		Scanner input = new Scanner(System.in);
		for (int i = 0; i <Row; i++) {
			for (int j = 0; j <Column; j++) {
				System.out.println("Enter numbers: ");
				arr[i][j] = input.nextInt();
				
			}
		}
		for (int i = 0; i <Row; i++) {
			for (int j = 0; j <Column; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		input.close();

	}

}
