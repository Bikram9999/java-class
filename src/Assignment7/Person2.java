package Assignment7;

public class Person2 {

	public static void main(String[] args) {
		
		Person obj1 = new Person();
		obj1.setRoll(20);
		obj1.setName("Bikram");
		obj1.setNationality("Nepalese");
		System.out.println(obj1.getRoll());
		System.out.println(obj1.getName());
		System.out.println(obj1.getNationality());
		
		System.out.println("==========");
		
		Person obj2 = new Person();
		obj2.setRoll(40);
		obj2.setName("Alex");
		obj2.setNationality("American");
		System.out.println(obj2.getRoll());
		System.out.println(obj2.getName());
		System.out.println(obj2.getNationality());
		
		

	}

}
