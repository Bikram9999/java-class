package day14;

public class Demo {
	
	public void printTable(int n) {
		for(int i = 1; i <= 10; i++) {
			int t = n * i;
			System.out.println(n + "*" + i + "=" + t );
		}
	}

	public void findNthSum(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
		sum = sum + i;
		}
		System.out.println("Sum of nth number is: " + sum);
		
	}
	
		public void reverseNumber(int originalNumber) {
			int reverseNumber = 0;
			
			System.out.println("original number is: " + originalNumber);
			while(originalNumber != 0) {
				int temp = originalNumber % 10;//remainder
				reverseNumber = reverseNumber * 10 + temp;
				originalNumber = originalNumber/10;//quotient
				
			}
			
			System.out.println("Reverse number is: " + reverseNumber );
		
	}
}
