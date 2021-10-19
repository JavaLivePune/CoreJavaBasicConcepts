package com.javalive.controlStatementsPrograms;

import java.util.Random;

public class GenerateRandomNumber {
	public static void main(String[] args) {
	      int counter;
	      Random rnum = new Random();
	      /* Below code would generate 5 random numbers
	       * between 0 and 200.
	       */
	      System.out.println("Random Numbers:");
	      System.out.println("***************");
	      for (counter = 1; counter <= 5; counter++) {
	         System.out.println(rnum.nextInt(200));
	      }
	   }
}
/*The output of above program would not be same everytime. It would generate any 5 random numbers 
between 0 and 200 whenever you run this code. For e.g. When I ran it second time, it gave me the 
below output, which is entirely different from the above one.*/