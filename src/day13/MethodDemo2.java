package day13;

public class MethodDemo2 {

	// <access modifier> <return type> <method name> () {
	public static int findSum() {
		int a = 5;
		int b = 6;
		int sum = a + b;
		// return a + b;
		return sum;
	}

	// <access modifier> <return type> <method name> (any no. of arguments)
	public static int findMax(int a, int b) {
		int max = 0;
		if (a > b) {
			max = a;
		} else {
			max = b;
		}
		return max;

	}

	public static void main(String[] args) {
		int s = MethodDemo2.findSum();
		System.out.println("Sum is: " + s);

		int a = 5;
		int b = 6;

		int m = MethodDemo2.findMax(a, b);
		System.out.println("Max number is " + m);

	}

}
