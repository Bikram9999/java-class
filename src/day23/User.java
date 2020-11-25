package day23;

public class User {
	
	private String username;
	private String password;
	
	
	public User(String u, String p) {//this is constructor syntax
		username = u;//this is initialize 
		password = p;
		System.out.println("arg constructor called...");
		
	}

	public User() {//if nothing on the bracket
		this.username = username;
		System.out.println("default constructor called...");
	}
	public void display() {
		System.out.println("Username is: " + username);
		System.out.println("Password is: " + password);
	}
	public static void main(String[] args) {
		User user1 = new User("uu@@@1", "bnnnnn");
		user1.display();
		//() is used for calling constructor
	}

	}



