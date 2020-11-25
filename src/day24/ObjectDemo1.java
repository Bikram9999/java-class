package day24;

public class ObjectDemo1 {

	public static void main(String[] args) {
		System.out.println(new ObjectDemo1());//anonymous object
		
		ObjectDemo1 obj1;//int a;
		obj1 = new ObjectDemo1();//a = 5;
		System.out.println(obj1);
		
		ObjectDemo1 obj2 = new ObjectDemo1();//int a = 5;
		System.out.println(obj2);
		System.out.println("day24.ObjectDemo1@"+Integer.toHexString(obj2.hashCode()));

	}

}

