package java_concepts;

public class MultiLevelInheritance {

	public static void main(String[] args) {
		// create object for Electrical car
		
		ElectricCar tesla = new ElectricCar();
		tesla.startEngine();
		tesla.openTrunk();
		tesla.chargeBattery();

	}
	
}

class Vehicle {
    void startEngine() {
        System.out.println("Engine started.");
    }
}

// Intermediate class
class Car extends Vehicle {
    void openTrunk() {
        System.out.println("Trunk is open.");
    }
}

// Derived class
class ElectricCar extends Car {
    void chargeBattery() {
        System.out.println("Battery is charging.");
    }
}
