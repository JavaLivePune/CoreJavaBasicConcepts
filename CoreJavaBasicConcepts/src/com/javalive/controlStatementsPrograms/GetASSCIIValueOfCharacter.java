package com.javalive.controlStatementsPrograms;

public class GetASSCIIValueOfCharacter {
	public static void main(String[] args) {

        char ch = 'P';
        // type casting char as int
        int asciiValue = (int)ch;

        System.out.println("ASCII value of "+ch+" is: " + asciiValue);
    }
}
