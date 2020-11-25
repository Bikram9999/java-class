package day9;

public class ElseIfDemo {

	public static void main(String[] args) {
		
		int marks = 30;
		
		if(marks < 0 || marks >=101) {
			System.out.println("Invalid marks.");
		}
		else if(marks > 80 && marks <= 100) {
		System.out.println("distinction");
		}
		else if(marks > 60 && marks <= 79) {
	    System.out.println("first");
		}
		else if(marks >= 40 && marks <= 59) {
		System.out.println("second");
	
        }
		else {
			System.out.println("fail");
		}
		System.out.println("More code");
		System.out.println("End");


	}

}
