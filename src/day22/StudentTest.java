package day22;

public class StudentTest {

	public static void main(String[] args) {
		
		Student obj1 = new Student();
		obj1.setName("ram");//set
		obj1.setRoll(20);//set
		System.out.println(obj1.getName());//get
		System.out.println(obj1.getRoll());//get
		
		System.out.println("===========");
		Student obj2 = new Student();
		obj2.setName("Hari");
		obj2.setRoll(30);
		System.out.println(obj2.getName());
		System.out.println(obj2.getRoll());
		

	}

}
