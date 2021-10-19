package com.javalive.controlStatementsPrograms;




/**
 * @author JavaLive.com
 *In the following program we have two integer numbers num1 and num2 and we are finding the 
 *quotient and remainder when num1 is divided by num2, so we can say that num1 is the dividend 
 *here and num2 is the divisor.
 *To compute the quotient and remainder we have created two variables with the name quotient and remainder respectively.
To find the quotient we divide the num1 by num2 using / operator. Since both the variables num1 & num2 are integers, 
the result will be integer despite the fact that the result of 15/2 is 7.5 mathematically. So the value assigned to the variable quotient after the operation is 7.
To find the remainder, we use the % operator. The remainder of 15/2 i.e 1 is assigned to the variable remainder after operation.
At the end of the program the values of variables quotient and remainder are printed.
 */
public class FindQuotientAndRemainder {
	public static void main(String[] args) {
        int num1 = 15, num2 = 2;
        int quotient = num1 / num2;
        int remainder = num1 % num2;
        System.out.println("Quotient is: " + quotient);
        System.out.println("Remainder is: " + remainder);
    }
}
