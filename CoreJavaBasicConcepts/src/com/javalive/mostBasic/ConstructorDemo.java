package com.javalive.mostBasic;

public class ConstructorDemo {
	private int num;
	private String name;

	public ConstructorDemo() {
		System.out.println("This is non parameterised constructor.");
	}

	public ConstructorDemo(int num) {
		//Note that here only num is method parameter and this.num is instance variable.
		//this.num = num;//Here we have not assign the value to the instance variable. Hence it is still have the default value.
		System.out.println("Parameterised constructor. Value of method num is " + num);
		System.out.println("Parameterised constructor. Value of instance num is still " + this.num+" as we have not yet assigned the value to it.");
	}

	public ConstructorDemo(String name) {
		this.name = name;//Look here the assignment is very important. Now instance variable got the value.
		System.out.println("Parameterised constructor. Value of method num is " + name);
		System.out.println("Parameterised constructor. Value of instance num is " + this.name);
	}

	public ConstructorDemo(int num, String name) {
		this.num = num;
		System.out.println("Parameterised constructor. Value of method num is " + num);
		System.out.println("Parameterised constructor. Value of instance num is " + this.num);
		this.name = name;
		System.out.println("Parameterised constructor. Value of method num is " + name);
		System.out.println("Parameterised constructor. Value of instance num is " + this.name);
	}
    
	public static void main(String[] args) {
		System.out.println("=================Calling first constructor===================");
		ConstructorDemo obj=new ConstructorDemo();//We are not passing any parameter here.
		System.out.println("=================Calling second constructor===================");
		ConstructorDemo obj1=new ConstructorDemo(10);//Providing integer parameter.
		System.out.println("=================Calling third constructor===================");
		ConstructorDemo obj2=new ConstructorDemo("Name");//Providing string parameter.
		System.out.println("=================Calling fourth constructor===================");
		ConstructorDemo obj3=new ConstructorDemo(30,"NewName");//Providing both integer and string parameters.
	}
}
