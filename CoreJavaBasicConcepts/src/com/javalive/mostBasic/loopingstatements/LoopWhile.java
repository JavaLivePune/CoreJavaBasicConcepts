package com.javalive.mostBasic.loopingstatements;

/**
 * @author JavaLive.com description The Java while loop is used to iterate a
 *         part of the program several times. If the number of iteration is not
 *         fixed, it is recommended to use while loop.
 * 
 *         Syntax:
 * 
 *         while(condition){ //code to be executed }
 *
 */
public class LoopWhile {
	public void finiteWhileLoop() {
		int i = 1;
		while (i <= 10) {
			System.out.println(i);
			i++;
		}
	}
	public void infiniteWhileLoop() {
		while(true){  
	        System.out.println("infinite while loop");  
		}//Press ctrl+c or STOP Button at the top to exit from this loop.
	}
	public static void main(String[] args) {
		LoopWhile obj=new LoopWhile();
		obj.finiteWhileLoop();
		//obj.infiniteWhileLoop();
	}
}
