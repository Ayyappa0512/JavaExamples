package java_concepts;

public class Interfaces {
	
//	Method types	Abstract, default, static, private (since Java 8+)
//	Variables	public static final by default

	public static void main(String[] args) {
		// Interface is a 100% abstract class and it is used to achieve multilevel
		// inheritance
		// Simple interface
		Animal1 dog = new Dog1();
		dog.makeSound();

		// Multilevel Interface
		Duck duck = new Duck();
		duck.fly();
		duck.swim();

	}

}

//Define an interface
interface Animal1 {
	void makeSound(); // method without body
}

//Implement the interface
class Dog1 implements Animal1 {
	public void makeSound() {
		System.out.println("Dog barks");
	}
}

interface Flyable {
	void fly();
}

interface Swimmable {
	void swim();
}

// A class implementing multiple interfaces
class Duck implements Flyable, Swimmable {
	public void fly() {
		System.out.println("Duck flies");
	}

	public void swim() {
		System.out.println("Duck swims");
	}
}
