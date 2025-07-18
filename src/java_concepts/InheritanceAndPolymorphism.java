package java_concepts;

public class InheritanceAndPolymorphism {
	
	// Inheritance key points 
//	Uses the extends keyword.
//	Supports single inheritance only (a class can inherit from only one superclass).
//	Allows method overriding.
//	Enables code reuse.
	// In java single inheritance and multi-leve inheritance not multiple inheritance
	
	//method overriding is a runtime Polymorphism 
	//method overloading is a compile time polymorphism
	public static void main(String[] args) {
		Animal any = new Animal();
		Animal dog  = new Dog();
		Animal cat  = new Cat();
		any.makeSound();
		dog.makeSound();
		cat.makeSound();
		
		any.makeSound("Horse", "neigh");
		
		//If we create a parent/base class object we can't use the child method but we can use overriding methods 
		Dog dog2 = new Dog();
		dog2.makeSound();
		dog2.makeSound("puppy", "barking");
		dog2.eat();

	}	
 
}
class Animal {
	void makeSound() {
		System.out.println("Animal make sound");
	}
	
	//Method overloading 
	void makeSound(String Animal, String sound) {
		System.out.println(Animal+" make "+ sound+" sound");
	}
}

class Dog extends Animal{
	//method overriding 
	void makeSound(){
		System.out.println("Dog barks");
	}
	
	void eat() {
		System.out.println("Eating food");
	}
}

class Cat extends Animal{
	void makeSound() {
		System.out.println("Cat meows");
	}
}
