package com.javalive.controlStatementsPrograms;

import java.util.Scanner;

/**
 * @author Administrator
 * @description This program calculates the grade of a student based on the marks entered by user 
 * in each subject. Program prints the grade based on this logic.
If the average of marks is >= 80 then prints Grade ‘A’
If the average is <80 and >=60 then prints Grade ‘B’
If the average is <60 and >=40 then prints Grade ‘C’
else prints Grade ‘D

To understand this Program you should have the knowledge of following concepts of Java:

Java For Loop
Arrays in Java
if..else-if in Java
 */
public class CalculateAndDisplayStudentGrade {
	 public static void main(String args[])
	    {
	    	/* This program assumes that the student has 6 subjects,
	    	 * thats why I have created the array of size 6. You can
	    	 * change this as per the requirement.
	    	 */
	        int marks[] = new int[6];
	        int i;
	        float total=0, avg;
	        Scanner scanner = new Scanner(System.in);
			
	        
	        for(i=0; i<6; i++) { 
	           System.out.print("Enter Marks of Subject"+(i+1)+":");
	           marks[i] = scanner.nextInt();
	           total = total + marks[i];
	        }
	        scanner.close();
	        //Calculating average here
	        avg = total/6;
	        System.out.print("The student Grade is: ");
	        if(avg>=80)
	        {
	            System.out.print("A");
	        }
	        else if(avg>=60 && avg<80)
	        {
	           System.out.print("B");
	        } 
	        else if(avg>=40 && avg<60)
	        {
	            System.out.print("C");
	        }
	        else
	        {
	            System.out.print("D");
	        }
	    }
}
