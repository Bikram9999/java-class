package day24;

public class ThisDemo2 {
	
	//instance variable
		private String name;
		private int age;
		
		//'this' is a keyword and is an implicit reference variable of current type
		//and current object and is available inside non static method n constructor of class
		//non static method/constructor
		public ThisDemo2(String name, int age) {//local variable
			this.name = name;//if local variable&instance variable name is same
			this.age = age;//then we use this...
		}
		public void display() {
			System.out.println("Name is: " + name);
			System.out.println("Age is: " + age);
		}
		

		

		public static void main(String[] args) {
			
			ThisDemo2 obj1 = new ThisDemo2("David", 33);			
			obj1.display();


		}
}
