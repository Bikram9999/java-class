package day29_polymorphism;

import java.util.Scanner;

public class AnimalTest {
	
	public static void getAnimalBehavior(Animal animal) {
		animal.makeSound();
	}

	public static void main(String[] args) {
		Animal animal = null;
		Scanner input = new Scanner(System.in);
		System.out.println("Which animal behavior do you want to listen the sound?");
		String choice = input.next();
		switch (choice) {
		case "Tiger":
			animal = new Tiger();
			break;
		case "Dog":
			animal = new Dog();
			break;
		default:
			System.out.println("wrong choice!!!");
			break;
	}
		if(animal!= null) {
			AnimalTest.getAnimalBehavior(animal);
		}

}
}
	
