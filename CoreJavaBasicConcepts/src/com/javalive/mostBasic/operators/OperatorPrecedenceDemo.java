package com.javalive.mostBasic.operators;

public class OperatorPrecedenceDemo {
	public void example1() {
		System.out.println("Evaluating Operator Precedence with pre and post addition unary operator");
		int a = 10, b = 5, c = 1, result;
		result = a - ++c - ++b;
		System.out.print("Result is ");
		System.out.println(result);
	}

	/*
	 * So in the above example we have used the post-addition and pre-addition unary
	 * operator to evaluate an expression. First b will be incremented to 6 from 5,
	 * then c will be incremented to 2 from 1 and then a is set to 10 in the order
	 * of associativity. Afterwards, 2 will subtracted from 10 and 2 will be
	 * subtracted from the result of (10-2) making final result to 2,
	 */
	public void example2(int year) {
		boolean a = (((year % 4) == 0) && ((year % 100) != 0)) || ((year % 400) == 0); // most clear due to Parenthesis
		boolean b = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0); // less clear expression
		boolean c = (year % 4 == 0 && year % 100 != 0) || year % 400 == 0; // less clear expression
		boolean d = ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0); // less clear expression
		boolean e = year % 4 == 0 && year % 100 != 0 || year % 400 == 0; // least clear expression
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
	}
	/*
	 * In the above code snippet, we have tried to highlight the readability of the
	 * same java expression using the parenthesis. With parenthesis, we can make out
	 * the smaller expressions within the larger expressions clearly, which in turn
	 * improves the readability of the code. In this example we have used the
	 * binary(%) and logical operators (!,&&, ||).
	 */
	public void example3() {
		System.out.println("Evaluating the Temperature Conversion");
		double fahrenheit = 98.4;

		double celsius = (5.0 * (fahrenheit - 32.0)) / 9.0; // clear expression because of the Parenthesis

		System.out.println(fahrenheit + " F is same as " + celsius + " C.");
	}
	/*
	 * In this example, we have again emphasised the use of parenthesis to increase
	 * the readability of the expression. In this example, we have used multiple
	 * binary operators including multiplication, division and subtraction. First we
	 * will solve the expression within the parenthesis, followed by the outer
	 * expression from left to right to maintain the rules of associativity.
	 */
	public static void main(String[] args) {
		OperatorPrecedenceDemo obj = new OperatorPrecedenceDemo();
		System.out.println("Calling method example1");
		obj.example1();
		System.out.println("Calling method example2");
		obj.example2(2019);
		System.out.println("Calling method example3");
		obj.example3();
	}
}
