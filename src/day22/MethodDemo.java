package day22;

public class MethodDemo {
	
	public  void printArray(int... arr) {//[] ... same thing 
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
}
	public static void main(String[] args) {
		MethodDemo obj = new MethodDemo();
		obj.printArray(20, 34, 56, 70);
		
		int [] arr = {20, 34, 56};
		obj.printArray(arr);
		
		obj.printArray(new int[] { 40, 50,60,70 });
		
	}
}

