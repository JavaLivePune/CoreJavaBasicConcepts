package com.javalive.controlStatementsPrograms;


/*Factorial of a number n is denoted as n! and the value of n! is: 1 * 2 * 3 * … (n-1) * n*/
public class FactorialOfNumber {
	public static void main(String[] args) {

    	//We will find the factorial of this number
        int number = 5;
        long fact = 1;
        for(int i = 1; i <= number; i++)
        {
            fact = fact * i;
        }
        System.out.println("Factorial of "+number+" is: "+fact);
    }
}
