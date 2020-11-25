package day14;

import java.util.Scanner;

//Question23
public class ForLoopDemo {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number: ");
		int n = input.nextInt();
		

		
	
		int sum = 0;//you need to assume local variable 0
	   //for loop syntax
		//for(initialization; condition; update(increment/decrement)) {
        for(int i = 1; i <= n; i++) {
        	sum = sum + i;
        }

        System.out.println("Sum of nth number is: " + sum);
        input.close();
		
			
	}	
		
	}
	
	
	
	

//Looping
//1.for loop=for certainity
//2.while loop=for uncertainity
//3.do-while loop
//4.for-each(enhanced for loop)