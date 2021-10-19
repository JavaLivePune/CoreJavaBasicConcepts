package com.javalive.controlStatementsPrograms;

import java.util.Scanner;

/*Finding square root of a number is very easy, we can use the Math.sqrt() method
to find out the square root of any number. However in this tutorial we will do 
something different, we will write a java program to find the square root of a 
number without the sqrt() method.*/

/*In the following program we have created a method squareRoot(), in the method we 
have written a equation which is used for finding out the square root of a number. 
For the equation we have used do while loop.*/


public class FindSquareRootOfANumber {
	public static double squareRoot(int number) {
		double temp;

		double sr = number / 2;

		do {
			temp = sr;
			sr = (temp + (number / temp)) / 2;
		} while ((temp - sr) != 0);

		return sr;
	    }

	    public static void main(String[] args)  
	    { 
		System.out.print("Enter any number:");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt(); 
		scanner.close();

		System.out.println("Square root of "+ num+ " is: "+squareRoot(num));
	    } 
}
