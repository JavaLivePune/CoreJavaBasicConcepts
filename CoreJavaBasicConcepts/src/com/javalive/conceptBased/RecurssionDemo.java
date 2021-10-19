package com.javalive.conceptBased;

/**
 * @author JavaLive.com 
 * 		   description Recursion in java is a process in which a
 *         method calls itself continuously. A method that calls itself
 *         is called recursive method.
 * 
 *         It makes the code compact but quite difficult to understand.
 * 
 *         Syntax:
 * 
 *         return_type method_name(){ //code to be executed methodname();//calling
 *         same method } 
 *         Below is the example of recursion to calculate Factorial of a number.
 *         
 *         To understand the program better, please run it in debug mode.
 *         Also look for static method and its calling. 
 */
public class RecurssionDemo {
	static long factorial(int n) {
		if (n == 1)
			return 1;
		else
			return (n * factorial(n - 1));
	}

	public static void main(String[] args) {
		System.out.println("Factorial of entered number is: " + factorial(10));
	}
}
