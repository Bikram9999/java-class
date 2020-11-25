package day29_polymorphism;

import java.util.Scanner;

public class AccountTest {
		//Account account = new SavingAccount();
		//account.openAccount();
		
		//account = new CurrentAccount();
		//account.openAccount();
		//this functionality called polymurphis
	public static void open(Account account) {
		account.openAccount();
	}
	public static void main(String[] args) {//called runtime dynamic polymorphism
		Account account = null;//dynamic
		Scanner input = new Scanner(System.in);
		System.out.println("Which account do you want to open?");
		String choice = input.next();
		switch (choice) {
		case "saving":
			account = new SavingAccount();
			break;
		case "current":
			account = new CurrentAccount();
			break;
		default:
		      System.out.println("wrong choice!!");
		      break;
		}
		
		if(account!=null) {
			AccountTest.open(account);
			
		}
		input.close();
				
		


}
}