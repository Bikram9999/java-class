package day27_AbstractClass;

public class ShapeTest {//main method call

	public static void main(String[] args) {
		Shape shape = new Triangle();
		shape.draw();
		
		shape = new Circle();
		shape.draw();

	}

}
