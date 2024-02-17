package java_concepts;

public class P2_DataTypes {


	public static void main(String[] args) {

		//There are 2 data tyes in java 
		// primitive data types and non primitive data types 
		
		//primitive data types - is a fundamental type of data that stores one type of data
		//byte, short, int, long, float, double, boolean and char
//		Data Type 	Default Value 	Default size
//		boolean 		false 			1 bit
//		char 			'\u0000' 		2 byte
//		byte 			0 				1 byte
//		short 			0 				2 byte
//		int 			0 				4 byte
//		long 			0L 				8 byte
//		float 			0.0f 			4 byte
//		double 			0.0d 			8 byte
		
		//non-primitive data types - data structure that stores more than one type of data
		//String, Array,List, Set, classes etc 

		
		//primitive data 
		//1.byte
		//The byte range lies between -128 to 127. default value is 0.
		byte b1 = 0;
		byte b2 = -128;
		byte b3  = 127;
		
		System.out.println("Byte b1: "+b1+ "\nByte b2: "+b2+"\nByte b3: "+b3);
		
		//2.short
		// short ranges lies between -32768(2^15) to 32767(2^15-1). default value is 0 and default size is 2 bytes 
		short s1 = 0; 
		short s2 = -32768;
		short s3 = 32767;
		
		System.out.println("Short s1: "+b1+ "\nShort s2: "+s2+"\nShort s3: "+s3);
		
		//3.int 
		//Its a 32 bit signed 2 component integer and ranging from -2^(31) (=2147483648) to 2^(31)-1 (=2147483647) including 0.
		int num1 = 2147483647;
		int num2 = -2147483648;
		System.out.println("int num1: "+num1+ "\nint num2: "+num2);
		
		//long
		//The long data type is a 64-bit two's complement integer. 
		//Its value-range lies between -9,223,372,036,854,775,808(-2^63) to 9,223,372,036,854,775,807(2^63 -1)
		long l1= -9223372036854775808L; //ending with "L" if not specified it will act as a int data type only
		long l2= 9223372036854775807L;
		System.out.println("long l1: "+l1+ "\nlong l2: "+l2);
		
		//float
		//float data type is of a single precision 32-bit IEEE 754 floating point
		//default value 0.0f
		
		float f1 = 44.999f;
		System.out.println("float f1: "+f1);
		
		//double
		//float data type is of a single precision 64-bit IEEE 754 floating point
		//default value 0.0d
		
		float d1 = 444004.999f;
		System.out.println("double d1: "+d1);
		
		//boolean 
		//It is one bit data type and has true or false accepted values
		
		boolean boolean1 = true;
		boolean boolean2 = false;
		System.out.println("Boolean boolean1: "+boolean1+"\nBoolean boolean2: "+boolean2);
		
		//char 
		//it is a single 16 bit unicode character range is '\u0000' (0) to '\uffff' (65535)
		
		char c1 = 'a';
		char c2 = '\u0000';
		char c3 = '\u0003';
		char c4 = '\ufff6';
		System.out.println("char c1: "+c1+"\nchar c2: "+c2+"\nchar c3: "+c3+"\nchar c4: "+c4);
		
		//Non primitive types 
		//String => It is a object that represents sequence of characters
		String s = "Hello java";
		System.out.println(s);
		
		//Note primitive can't have value as null but non-primitive data types can have null value
  	}
	
	
}
