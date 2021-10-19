package com.javalive.mostBasic.controllstatements;



/**
 * @author JavaLive.com
 * @description Continue statement is mostly used inside loops. Whenever it is encountered inside a loop, 
 * control directly jumps to the beginning of the loop for next iteration, skipping the execution of 
 * statements inside loop’s body for the current iteration. This is particularly useful when you want 
 * to continue the loop but do not want the rest of the statements(after continue statement) in loop body 
 * to execute for that particular iteration.
 * Syntax:
   continue word followed by semi colon.
   continue;
 */
public class ContinueDemo {
	public static void main(String args[]){
		int counter=10;
		while (counter >=0)
		{
	           if (counter==7)
	           {
		       counter--;
		       continue;  // here it skips 7, does not print it and continue with loop. 
	           }
	           System.out.print(counter+" ");
	           counter--;
		}
	   }
}
// output 10 9 8 6 5 4 3 2 1 0