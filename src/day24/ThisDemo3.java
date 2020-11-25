package day24;

public class ThisDemo3 {
	
	//instance variable
	int a = 5;
	
	//shadowing is the concept of hiding instance variable by local variable of
	//non static method or constructor of a class
	public void show() {
		System.out.println("this is: " + this);
		System.out.println(this.a);//5
		//local variable
		int a = 6;
		System.out.println(a);//6
		System.out.println(this.a);
		int sum = a + this.a;//this.a gives instance value
		System.out.println("Sum is: " + sum);
	}
	

	public static void main(String[] args) {
		ThisDemo3 obj = new ThisDemo3();
		System.out.println("obj is: " + obj);
		obj.show();
		
		System.out.println("=======");
		ThisDemo3 obj1 = new ThisDemo3();
		System.out.println("obj1 is: " + obj1);
		obj1.show();


	}

}
