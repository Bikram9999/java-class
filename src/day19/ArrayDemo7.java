package day19;

public class ArrayDemo7 {

	//without combination
	public static void main(String[] args) {
		int [][] arr = { {23, 34, 45 }, { 45, 65, 44}, { 90, 88, 77}};
		
		for (int i = 0; i <arr.length; i++) {
			for (int j = 0; j <arr.length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();


	}

	}
}