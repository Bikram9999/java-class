package Assignment6MethodCall;

public class Question18 {

	public static void findLargestNumber() {
		int a = 15;
		int b = 7;
		int c = 11;

		if (a > b) {
			if (a > c) {
				System.out.println("a is largest one. ");// a=15
			} else {
				System.out.println("c is greatest one. ");
			}
		} else {
			System.out.println("a is smaller than b but smaller or greater than c. ");
		}
	}

	public static void main(String[] args) {
		findLargestNumber();
	}

}
