package BankProject;

public class BankAccountTest {
	
	
		public static void main(String[] args) {
			BankAccount bikramAccount = new BankAccount("Bikram");
			bikramAccount.depositFund(500);
			bikramAccount.withdrawFund(200);
			
			BankAccount davidAccount = new BankAccount("David", 2000);
			davidAccount.withdrawFund(200);
			davidAccount.depositFund(500);
			
			bikramAccount.depositFund(700);
			

		

	}

}
