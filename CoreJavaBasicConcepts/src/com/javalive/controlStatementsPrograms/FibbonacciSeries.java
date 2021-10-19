package com.javalive.controlStatementsPrograms;

/*The Fibonacci sequence is a series of numbers where a number is the sum of previous two numbers. 
Starting with 0 and 1, the sequence goes 0, 1, 1, 2, 3, 5, 8, 13, 21, and so on. Here we will 
write three programs to print fibonacci series 1) using for loop 2) using while loop 3) based 
on the number entered by user.*/
public class FibbonacciSeries {
	public static void main(String[] args) {
        int count = 10, num1 = 0, num2 = 1;
        System.out.print("Fibonacci Series of "+count+" numbers:");

        for (int i = 1; i <= count; ++i)
        {
            System.out.print(num1+"    ");

            /* On each iteration, we are assigning second number
             * to the first number and assigning the sum of last two
             * numbers to the second number
             */
            int sumOfPrevTwo = num1 + num2;
            num1 = num2;
            num2 = sumOfPrevTwo;
        }
    }
}
