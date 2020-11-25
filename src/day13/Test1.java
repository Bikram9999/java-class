package day13;

public class Test1 {

	public static void main(String[] args) {
		Demo obj = new Demo();//non-static
		obj.sayHello();
		System.out.println(obj.nonStaticVar);
		
		Demo.sayHi();//static
		System.out.println(Demo.StaticVar);
		

	}

}
