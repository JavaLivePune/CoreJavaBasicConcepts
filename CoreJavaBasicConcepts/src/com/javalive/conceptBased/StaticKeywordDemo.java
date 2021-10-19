package com.javalive.conceptBased;

public class StaticKeywordDemo {

	public static int objectCount = 0;
	private int instanceVariable; 

	public StaticKeywordDemo() {
		objectCount++;
		this.instanceVariable++;
	}

	static void displayObjCount() {
		System.out.println("Value of static variable objectCount is "+ objectCount);
	}
	
	public void displayInstanceVariable() {
		System.out.println("Value of the instance variable instanceVariable is "+this.instanceVariable);
	}

	public static void main(String[] args) {
		StaticKeywordDemo obj1 = new StaticKeywordDemo();
		StaticKeywordDemo obj2 = new StaticKeywordDemo();
		StaticKeywordDemo obj3 = new StaticKeywordDemo();
		StaticKeywordDemo obj4 = new StaticKeywordDemo();
		StaticKeywordDemo obj5 = new StaticKeywordDemo();
		StaticKeywordDemo obj6 = new StaticKeywordDemo();
		StaticKeywordDemo obj7 = new StaticKeywordDemo();
		StaticKeywordDemo obj8 = new StaticKeywordDemo();
		StaticKeywordDemo.displayObjCount();
		obj8.displayInstanceVariable();
	}
}
