package day14;

import java.util.Scanner;

public class WhileLoopDemo2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		boolean flag = true;
		while (flag) {//uncertainty condition
			System.out.println("Enter name: ");
			String name = input.next();
		if(name.equals("hari")) {//to make false conditon 
			flag = false;
		}
			
			System.out.println("Name is: " + name);
					
		}
		
		System.out.println("End");

	}

}
