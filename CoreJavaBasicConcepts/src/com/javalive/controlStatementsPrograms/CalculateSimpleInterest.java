package com.javalive.controlStatementsPrograms;

/*Simple Interest Formula
Simple Interest = (P × R × T)/100
P is Principal amount.
R is rate per annum.
T is time in years.

For example: Let’s say a man deposit 2000 INR in bank account at a interest rate of 6% per annum for 3 years, calculate the simple interest at the end of 3 years.

Simple interest = 2000*6*3/100 = 360 INR*/

import java.util.Scanner;

public class CalculateSimpleInterest {
	public static void main(String args[]) 
    {
        float p, r, t, sinterest;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Principal : ");
        p = scan.nextFloat();
        System.out.print("Enter the Rate of interest : ");
        r = scan.nextFloat();
        System.out.print("Enter the Time period : ");
        t = scan.nextFloat();
        scan.close();
        sinterest = (p * r * t) / 100;
        System.out.print("Simple Interest is: " +sinterest);
    }
}
