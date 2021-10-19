package com.javalive.mostBasic.loopingstatements;

/**
 * @author JavaLive.com description The Java do-while loop is used to iterate a
 *         part of the program several times. If the number of iteration is not
 *         fixed and you must have to execute the loop at least once, it is
 *         recommended to use do-while loop.
 * 
 *         The Java do-while loop is executed at least once because condition is
 *         checked after loop body.
 * 
 *         Syntax:
 * 
 *         do{ //code to be executed }while(condition); 
 *         
 *         Let's consider scenario where we want to take an integer input from user 
 *         until user have entered a positive number. In this case we will use a 
 *         do-while loop like.
 *         
 * 
 *         do { TakeInputFromUser() } while(input < 0)
 * 
 * 
 *         In this case we have to run loop at-least once because we want input
 *         from user at-least once. This loop will continue running until user
 *         enters a positive number.
 * 
 */
public class LoopDoWhile {
	public void doWhileDemo() {
		int i = 1;
		do {
			System.out.println(i);
			i++;
		} while (i <= 0);
	}

	public static void main(String[] args) {
		LoopDoWhile obj = new LoopDoWhile();
		obj.doWhileDemo();
	}
}
