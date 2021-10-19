package com.javalive.mostBasic.controllstatements;



/**
 * @author JavaLive
 * description 
Java Conditions and If Statements

Java supports the usual logical conditions from mathematics:
Less than: a < b
Less than or equal to: a <= b
Greater than: a > b
Greater than or equal to: a >= b
Equal to a == b
Not Equal to: a != b
You can use these conditions to perform different actions for different decisions.

Java has the following conditional statements:

Use if to specify a block of code to be executed, if a specified condition is true
Use else to specify a block of code to be executed, if the same condition is false
Use else if to specify a new condition to test, if the first condition is false
Use switch to specify many alternative blocks of code to be executed
The if Statement
Use the if statement to specify a block of Java code to be executed if a condition is true.

Syntax
if (condition) {
  // block of code to be executed if the condition is true
}
Note that if is in lowercase letters. Uppercase letters (If or IF) will generate an error.

 
 */
public class IfElseIfStatement {
	public static void main(String args[]){
		int num=1234;
		if(num <100 && num>=1) {
		  System.out.println("Its a two digit number");
		}
		else if(num <1000 && num>=100) {
		  System.out.println("Its a three digit number");
		}
		else if(num <10000 && num>=1000) {
		  System.out.println("Its a four digit number");
		}
		else if(num <100000 && num>=10000) {
		  System.out.println("Its a five digit number");			
		}
		else {
		  System.out.println("Number is not between 1 & 99999");			
		}
	   }
}
