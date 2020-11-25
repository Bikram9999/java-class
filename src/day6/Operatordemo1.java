package day6;

public class Operatordemo1 {

	public static void main(String[] args) {
		
		// 1.Arithmetic Operators   + - / * %
		// precedence(priority) + -(low) / * %(high)
		//Associativity left to right
		
		int a = 4 + 5 - 4 / 2 - 7 % 2 + 3 * 2;
		System.out.println(a);
		
		System.out.println(7/2);//divide cocient 3
		System.out.println(7%2);//% modulus remainder
		
		// 2.Assignment Operator  = += -= /= *= %= //shorthand operator
		//Associativity: Right to left //means value of a 
		
		int x = 5;
		System.out.println(x);
		x -=2;//x = x - 2;
		System.out.println(x);
		
		
    
	}

}
