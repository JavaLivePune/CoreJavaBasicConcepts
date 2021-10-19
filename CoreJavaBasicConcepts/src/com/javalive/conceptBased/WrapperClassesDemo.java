package com.javalive.conceptBased;

/**
 * @author javalive.com 
 * 		   “What's the purpose of a wrapper class?”. It's one of
 *         the most common Java interview questions.
 * 
 *         Basically, generic classes only work with objects and don't support
 *         primitives. As a result, if we want to work with them, we have to
 *         convert primitive values into wrapper objects.
 * 
 *         For example, the Java Collection Framework works with objects
 *         exclusively. Long back when (prior to Java 5, almost 15 years back)
 *         there was no autoboxing and we, for example, couldn't simply call
 *         add(5) on a collection of Integers.
 * 
 *         At that time, those primitive values needed to be manually converted
 *         to corresponding wrapper classes and stored in collections.
 * 
 *         Today, with autoboxing, we can easily do ArrayList.add(101) but
 *         internally Java converts the primitive value to an Integer before
 *         storing it in the ArrayList using the valueOf() method.
 * 
 * 
 */
public class WrapperClassesDemo {
	public static void main(String args[]) {
		// byte data type
		byte a = 1;

		// wrapping around Byte object
		Byte byteobj = new Byte(a);

		// int data type
		int b = 10;

		// wrapping around Integer object
		Integer intobj = new Integer(b);

		// float data type
		float c = 18.6f;

		// wrapping around Float object
		Float floatobj = new Float(c);

		// double data type
		double d = 250.5;

		// Wrapping around Double object
		Double doubleobj = new Double(d);

		// char data type
		char e = 'a';

		// wrapping around Character object
		Character charobj = e;

		// printing the values from objects
		System.out.println("Values of Wrapper objects (printing as objects)");
		System.out.println("Byte object byteobj:  " + byteobj);
		System.out.println("Integer object intobj:  " + intobj);
		System.out.println("Float object floatobj:  " + floatobj);
		System.out.println("Double object doubleobj:  " + doubleobj);
		System.out.println("Character object charobj:  " + charobj);

		// objects to data types (retrieving data types from objects)
		// unwrapping objects to primitive data types
		byte bv = byteobj;
		int iv = intobj;
		float fv = floatobj;
		double dv = doubleobj;
		char cv = charobj;

		// printing the values from data types
		System.out.println("Unwrapped values (printing as data types)");
		System.out.println("byte value, bv: " + bv);
		System.out.println("int value, iv: " + iv);
		System.out.println("float value, fv: " + fv);
		System.out.println("double value, dv: " + dv);
		System.out.println("char value, cv: " + cv);
	}
}