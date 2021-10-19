package com.javalive.controlStatementsPrograms;

import java.util.Scanner;

/*In this tutorial, we will write a java program to break an input integer number into digits. 
For example if the input number is 912 then the program should display digits 2, 1, 9 along 
with their position in the output.

Here we are using Scanner class to get the input from user. In the first while loop we are 
counting the digits in the input number and then in the second while loop we are extracting 
the digits from the input number using modulus operator.*/


public class BreakIntegerToDigit {
	 public static void main(String args[])
	    {
	        int num, temp, digit, count = 0;
	        
	        //getting the number from user
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter any number:");
	        num = scanner.nextInt();
	        scanner.close();
	        
	        //making a copy of the input number
	        temp = num;
	        
	        //counting digits in the input number
	        while(num > 0)
	        {
	            num = num / 10;
	            count++;
	        }
	        while(temp > 0)
	        {
	            digit = temp % 10;
	            System.out.println("Digit at place "+count+" is: "+digit);
	            temp = temp / 10;
	            count--;
	        }
	    }
}
