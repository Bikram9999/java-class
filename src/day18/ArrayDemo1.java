package day18;

public class ArrayDemo1 {
	
	public static void main(String[] args) {
		int [] arr = new int[3];//array declaration and initialization
		
		System.out.println(arr);//it gives object id
		
		System.out.println(arr.length);//size of an array
		
		//here, prints default value
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);//it gives an error value or exception
		
		//assigning value
		arr[0] = 44;
		arr[1] = 45;
		arr[2] = 22;
		
		//Here, prints given value
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		

}
}


//array:- is a group of same data type of elements arranged in a sequential order