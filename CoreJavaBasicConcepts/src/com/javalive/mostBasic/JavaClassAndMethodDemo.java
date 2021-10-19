package com.javalive.mostBasic;

public class JavaClassAndMethodDemo {
	public static void staticDisplay(String value) {
		System.out.println("This is static method and the value of the parameter is " + value);
	}

	public void instanceDisplay(String value) {
		System.out.println("This is instance method and the value of the parameter is " + value);
	}

	public void nonParameterisedDisplay() {
		System.out.println("This is nonparametersised instance method.");
	}
	
	public static void main(String[] args) {
		JavaClassAndMethodDemo obj=new JavaClassAndMethodDemo();
		obj.nonParameterisedDisplay();//Calling instance method by creating object of the class.
		obj.instanceDisplay("\'JavaLive.com!!!\'");
		
		JavaClassAndMethodDemo.staticDisplay("\'Just go for it.\'");//Calling static method directly by class name without creating object.
	}
}
