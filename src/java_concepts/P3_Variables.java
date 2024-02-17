package java_concepts;

public class P3_Variables {

//	Variable declaration syntax => dataType variableName = variableValue;
	//Types of variable 
	//Local variable => which is declared inside the method
	//Instance variable => which is declared in the class but outside the method.
	//static variable => which is declared with static keyword and it cant be local 
	
	//decalring instance variable
	int instanceVar; // Declaring variable without assigning the value 
	int instanceVar2 = 2; 
	
	//decalring static variable
	static int staticVar = 10;
	
	public void method1() {
		
		int localVar = 2;
		System.out.println("Local variable: "+localVar);
	}
	
	public static void main(String args[]) {
		
		//using  instance var 
		P3_Variables p3 =new P3_Variables();
		p3.instanceVar = 4;
		System.out.println("Instance variable1: "+p3.instanceVar);
		System.out.println("Instance variable2: "+p3.instanceVar2);
		
		//using static variable
		System.out.println("static variable1: "+staticVar);
		
		//can't use local variable out side the method, we can only able to call method
		p3.method1();
		
		
	}
}
