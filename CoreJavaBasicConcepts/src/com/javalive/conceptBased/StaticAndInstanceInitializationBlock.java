package com.javalive.conceptBased;


/**
 * @author JavaLive.com
 * 
 */
public class StaticAndInstanceInitializationBlock {
	{// This is instance initialization block without any name only with brackets. This is optional. 
		System.out.println("This is instance initialization block. This is common part of all constructor");
	}
	static {// This is static initialization block with name as static following brackets.This is optional.
		System.out.println("This is static initialization block.\nThis get executed only at once during class loading.");
	}
	
	public StaticAndInstanceInitializationBlock() {//This is non-parameterized constructor which is optional.
		System.out.println("This is non parameterized constructor.....");
	}
	
	public StaticAndInstanceInitializationBlock(String name) {//This is parameterized constructor which is optional.
		System.out.println("This is parameterized constructor with value "+name);
	}
	public static void main(String[] args) {
		System.out.println( "Hello World! This is line in main method before creating any object." );
		System.out.println("Creating first object.....");
		StaticAndInstanceInitializationBlock obj1=new StaticAndInstanceInitializationBlock();
		System.out.println("Creating second object.....");
		StaticAndInstanceInitializationBlock obj2=new StaticAndInstanceInitializationBlock("JavaLive.com");
	}
}
