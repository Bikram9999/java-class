package day19;

public class ForEachLoopDemo {

	public static void main(String[] args) {
		int[] arr = {10, 20, 30 } ;//for single dimension array
		
		for (int i = 0; i <arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("===========");//instance for loop
		for (int a: arr) {
			System.out.println(a);
		}

	}

}
