package com.javalive.mostBasic.operators;

public class RelationalOperatorDemo {
	public void equalsOperatorDemo() {
		// initializing variables
		int var1 = 5, var2 = 10, var3 = 5;

		// Displaying var1, var2, var3
		System.out.println("Var1 = " + var1);
		System.out.println("Var2 = " + var2);
		System.out.println("Var3 = " + var3);

		// Comparing var1 and var2
		System.out.println("var1 == var2: " + (var1 == var2));

		// Comparing var1 and var3
		System.out.println("var1 == var3: " + (var1 == var3));
	}

	public void notEqualsToOperatorDemo() {
		// initializing variables
		int var1 = 5, var2 = 10, var3 = 5;

		// Displaying var1, var2, var3
		System.out.println("Var1 = " + var1);
		System.out.println("Var2 = " + var2);
		System.out.println("Var3 = " + var3);

		// Comparing var1 and var2
		System.out.println("var1 == var2: " + (var1 != var2));

		// Comparing var1 and var3
		System.out.println("var1 == var3: " + (var1 != var3));
	}

	public void greaterThanOperatorDemo() {
		// initializing variables
		int var1 = 30, var2 = 20, var3 = 5;

		// Displaying var1, var2, var3
		System.out.println("Var1 = " + var1);
		System.out.println("Var2 = " + var2);
		System.out.println("Var3 = " + var3);

		// Comparing var1 and var2
		System.out.println("var1 > var2: " + (var1 > var2));

		// Comparing var1 and var3
		System.out.println("var3 > var1: " + (var3 >= var1));
	}

	public void lessThanOperatorDemo() {
		// initializing variables
		int var1 = 10, var2 = 20, var3 = 5;

		// Displaying var1, var2, var3
		System.out.println("Var1 = " + var1);
		System.out.println("Var2 = " + var2);
		System.out.println("Var3 = " + var3);

		// Comparing var1 and var2
		System.out.println("var1 < var2: " + (var1 < var2));

		// Comparing var2 and var3
		System.out.println("var2 < var3: " + (var2 < var3));
	}

	public void greaterThanOrEqualToOperatorDemo() {
		// initializing variables
		int var1 = 10, var2 = 20, var3 = 5;

		// Displaying var1, var2, var3
		System.out.println("Var1 = " + var1);
		System.out.println("Var2 = " + var2);
		System.out.println("Var3 = " + var3);

		// Comparing var1 and var2
		System.out.println("var1 < var2: " + (var1 < var2));

		// Comparing var2 and var3
		System.out.println("var2 < var3: " + (var2 < var3));
	}
	
	public void lessThanOrEqualToOperatorDemo() {
		// initializing variables 
        int var1 = 10, var2 = 10, var3 = 9; 
  
        // Displaying var1, var2, var3 
        System.out.println("Var1 = " + var1); 
        System.out.println("Var2 = " + var2); 
        System.out.println("Var3 = " + var3); 
  
        // Comparing var1 and var2 
        System.out.println("var1 <= var2: "
                           + (var1 <= var2)); 
  
        // Comparing var2 and var3 
        System.out.println("var2 <= var3: "
                           + (var2 <= var3)); 
	}
	
	public static void main(String[] args) {
		RelationalOperatorDemo obj =new RelationalOperatorDemo();
		System.out.println("Calling method equalsOperatorDemo.......");
		obj.equalsOperatorDemo();
		System.out.println("Calling method notEqualsToOperatorDemo.......");
		obj.notEqualsToOperatorDemo();
		System.out.println("Calling method greaterThanOperatorDemo.......");
		obj.greaterThanOperatorDemo();
		System.out.println("Calling method lessThanOperatorDemo.......");
		obj.lessThanOperatorDemo();
		System.out.println("Calling method greaterThanOrEqualToOperatorDemo.......");
		obj.greaterThanOrEqualToOperatorDemo();
		System.out.println("Calling method lessThanOrEqualToOperatorDemo.......");
		obj.lessThanOrEqualToOperatorDemo();
	}
}
