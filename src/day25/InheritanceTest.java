package day25;

public class InheritanceTest {

	public static void main(String[] args) {
		Parent obj = new Parent();
		System.out.println(obj.name);
		obj.sayHello();
		
		Child child = new Child();
		System.out.println(child.name);
		child.sayHello();
		}

	}


