package com.javalive.controlStatementsPrograms;

import java.util.Scanner;

/**
 * @author: JavaLive.com
 * @description: Program to calculate area and circumference of circle
 * with user interaction. User will be prompt to enter the radius and 
 * the result will be calculated based on the provided radius value.
 */

public class CalculateAreaAndCircumferenceOfCircle {
	static Scanner sc = new Scanner(System.in);
	   public static void main(String args[])
	   {
	      System.out.print("Enter the radius: ");
	      /*We are storing the entered radius in double
	       * because a user can enter radius in decimals
	       */
	      double radius = sc.nextDouble();
	      //Area = PI*radius*radius
	      double area = Math.PI * (radius * radius);
	      System.out.println("The area of circle is: " + area);
	      //Circumference = 2*PI*radius
	      double circumference= Math.PI * 2*radius;
	      System.out.println( "The circumference of the circle is:"+circumference) ;
	   }
}
