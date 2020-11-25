package day26;

public class Car {
	
	Engine engine;
	
	
	public void drive() {
		engine = new Engine();
		engine.move();
		System.out.println("Car started..");
		
	}
	
	public static void main(String[] args) {
		Car car = new Car();
		car.drive();
	}

}
