package day19;

public class ArrayDemo5 {

	public static void main(String[] args) {
		
		final int Row = 3;
		final int Column = 3;
		
		int [][] arr = new int[Row][Column];
		
		arr[0][0] = 10;
		arr[0][1] = 20;
		arr[0][2] = 30;
		
		arr[1][0] = 40;
		arr[1][1] = 50;
		arr[1][2] = 60;
		
		arr[2][0] = 70;
		arr[2][1] = 80;
		arr[2][2] = 90;
		
		for (int i = 0; i <Row; i++) {
			for (int j = 0; j <Column; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}


	}

}
