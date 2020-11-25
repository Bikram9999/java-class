package Assignment7;

public class Question37 {

	public static void main(String[] args) {
		final int Row = 3;
		final int Column = 3;
		
		int [][] matrixA = {{1,2,3},{4,5,6},{7,8,9}};
		
		int [][] matrixB = {{4,5,6},{2,7,8},{3,1,9}};
		
		int[][] result = new int[Row][Column];
		
		System.out.println("Matrix result is: ");
		for (int i = 0; i <Row; i++) {
			for (int j = 0; j <Column; j++) {
				result[i][j] = matrixA[i][j] + matrixB[i][j];
			}
			System.out.println();
			
		}
		for (int i = 0; i <result.length; i++) {
			for (int j = 0; j <result.length; j++) {
				System.out.print(result[i][j] + " ");
			}
			System.out.println();
		}
		}	
		
	}	
				

	


