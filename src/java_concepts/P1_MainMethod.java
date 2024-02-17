package java_concepts;

public class P1_MainMethod {

	// In Java execution always starts with main method script
	//main method always has string args[] as parameters	
	//The program will compile, but not run, because JVM will not recognize the main() method. 
	//Remember JVM always looks for the main() method with a string type array as a parameter.
	
	//static block is highest priority of execution
	//Java Execution priority static block => main(string args[]) method => instance of the class 
	
	
	static {
		System.out.println("===============Start===============");
		System.out.println("In the Static Block");
		System.out.println("===============End=================");
	}
	public static void main(String[] args) {
		System.out.println("===============Start===============");
		System.out.println("In the Main Block");
		
		// creating instance of the class, object is the instance of the class
		// syntax className objectName(instance) = new className(); constructor parameters if any
		
		P1_MainMethod  p1_object = new P1_MainMethod();
		p1_object.main(5);
		System.out.println("===============End=================");
	}
	
	//main can be over loaded 
	public void main(int a) {
		
		System.out.println("Inside main overloading method");
		System.out.println("Number: "+a);
	}
	
	//Different ways of writing main method 
	// public static void main(String args[]){}
	// public static void main(String[] x){}
	// public static void main(String []x){}
	// public static void main(String...args){}
}
