package com.javalive.mostBasic.operators;

public class ArithmeticOperatorDemo {
	public void additionDemo() {
		// initializing variables
		int num1 = 10, num2 = 20, sum = 0;

		// Displaying num1 and num2
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);

		// adding num1 and num2
		sum = num1 + num2;
		System.out.println("The sum = " + sum);
	}

	public void substractionDemo() {
		// initializing variables
		int num1 = 20, num2 = 10, sub = 0;

		// Displaying num1 and num2
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);

		// subtracting num1 and num2
		sub = num1 - num2;
		System.out.println("Subtraction = " + sub);
	}

	public void multiplicationDemo() {
		// initializing variables
		int num1 = 20, num2 = 10, mult = 0;

		// Displaying num1 and num2
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);

		// Multiplying num1 and num2
		mult = num1 * num2;
		System.out.println("Multiplication = " + mult);
	}

	public void divisionDemo() {
		// initializing variables
		int num1 = 20, num2 = 10, div = 0;

		// Displaying num1 and num2
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);

		// Dividing num1 and num2
		div = num1 / num2;
		System.out.println("Division = " + div);
	}

	public void modulusOperatorDemo() {
		// initializing variables
		int num1 = 5, num2 = 2, mod = 0;

		// Displaying num1 and num2
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);

		// Remaindering num1 and num2
		mod = num1 % num2;
		System.out.println("Remainder = " + mod);
	}

	public void preAndPostIncrementDemo() {
		// initializing variables
		int num = 5;

		// first 5 gets printed and then
		// increment to 6
		System.out.println("Post " + "increment = " + num++);

		// num was 6, incremented to 7
		// then printed
		System.out.println("Pre " + "increment = " + ++num);
	}

	public void preAndPostDecrementDemo() {
		// initializing variables
		int num = 5;

		// first 5 gets printed and then
		// decremented to 4
		System.out.println("Post " + "decrement = " + num--);

		System.out.println("num = " + num);

		// num was 4, decremented to 3
		// then printed
		System.out.println("Pre " + "decrement = " + --num);
	}
	public static void main(String[] args) {
		ArithmeticOperatorDemo obj=new ArithmeticOperatorDemo();
		obj.additionDemo();obj.substractionDemo();
		obj.multiplicationDemo();obj.divisionDemo(); obj.modulusOperatorDemo();
		obj.preAndPostIncrementDemo();obj.preAndPostDecrementDemo();
	}
}
