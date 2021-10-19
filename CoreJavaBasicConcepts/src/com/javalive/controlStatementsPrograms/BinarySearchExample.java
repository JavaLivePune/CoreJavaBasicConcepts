package com.javalive.controlStatementsPrograms;

import java.util.Scanner;


/*Here we will write a java program to check whether the input year is a leap year or not. Before we see the program, lets see how to determine whether a year is a leap year mathematically:
To determine whether a year is a leap year, follow these steps:
1. If the year is evenly divisible by 4, go to step 2. Otherwise, go to step 5.
2. If the year is evenly divisible by 100, go to step 3. Otherwise, go to step 4.
3. If the year is evenly divisible by 400, go to step 4. Otherwise, go to step 5.
4. The year is a leap year (it has 366 days).
5. The year is not a leap year (it has 365 days). Source of these steps.*/
public class BinarySearchExample {
	public static void main(String args[])
	   {
	      int counter, num, item, array[], first, last, middle;
	      //To capture user input
	      Scanner input = new Scanner(System.in);
	      System.out.println("Enter number of elements:");
	      num = input.nextInt(); 

	      //Creating array to store the all the numbers
	      array = new int[num];

	      System.out.println("Enter " + num + " integers");
	      //Loop to store each numbers in array
	      for (counter = 0; counter < num; counter++)
	          array[counter] = input.nextInt();

	      System.out.println("Enter the search value:");
	      item = input.nextInt();
	      first = 0;
	      last = num - 1;
	      middle = (first + last)/2;

	      while( first <= last )
	      {
	         if ( array[middle] < item )
	           first = middle + 1;
	         else if ( array[middle] == item )
	         {
	           System.out.println(item + " found at location " + (middle + 1) + ".");
	           break;
	         }
	         else
	         {
	             last = middle - 1;
	         }
	         middle = (first + last)/2;
	      }
	      if ( first > last )
	          System.out.println(item + " is not found.\n");
	   }
}
