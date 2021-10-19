package com.javalive.controlStatementsPrograms;

/*In the following example we are displaying the even numbers from 1 to n, 
the value of n we have set here is 100 so basically this program will print 
the even numbers between 1 to 100.
If an integer number(never a fraction number) is exactly divisible by 2 
which means it yields no remainder when divided by 2 then it is an even number. 
This same logic we are using here to find the even numbers. We are looping through 
1 to n and checking each value whether it is evenly divisible by 2 or not, if it is 
then we are displaying it. To understand this program you should have the basic 
knowledge of for loop in Java and if statement.*/

public class PrintEvenNumbersFrom1ton {
	public static void main(String args[]) {
		int n = 100;
		System.out.print("Even Numbers from 1 to "+n+" are: ");
		for (int i = 1; i <= n; i++) {
		   //if number%2 == 0 it means its an even number
		   if (i % 2 == 0) {
			System.out.print(i + " ");
		   }
		}
	   }
}
