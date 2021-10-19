package com.javalive.mostBasic.loopingstatements;

/**
 * @author JavaLive description The Java for loop is used to iterate a part of
 *         the program several times. If the number of iteration is fixed, it is
 *         recommended to use for loop.
 * 
 *         There are three types of for loops in java.
 * 
 *         Simple For Loop For-each or Enhanced For Loop Labeled For Loop A.
 *         Simple For Loop A simple for loop is the same as C/C++. We can
 *         initialize the variable, check condition and increment/decrement
 *         value. It consists of four parts: 1.Initialization: It is the initial
 *         condition which is executed once when the loop starts. Here, we can
 *         initialize the variable, or we can use an already initialized
 *         variable. It is an optional condition. 2. Condition: It is the second
 *         condition which is executed each time to test the condition of the
 *         loop. It continues execution until the condition is false. It must
 *         return boolean value either true or false. It is an optional
 *         condition. 3. Statement: The statement of the loop is executed each
 *         time until the second condition is false. 4. Increment/Decrement: It
 *         increments or decrements the variable value. It is an optional
 *         condition. Syntax: for(initialization;condition;incr/decr){
 *         //statement or code to be executed }
 * 
 *         B. Java for-each Loop The for-each loop is used to traverse array or
 *         collection in java. It is easier to use than simple for loop because
 *         we don't need to increment value and use subscript notation.
 * 
 *         It works on elements basis not index. It returns element one by one
 *         in the defined variable.
 * 
 *         Syntax:
 * 
 *         for(Type var:array){ //code to be executed }
 * 
 *         C. Java Labeled For Loop We can have a name of each Java for loop. To
 *         do so, we use label before the for loop. It is useful if we have
 *         nested for loop so that we can break/continue specific for loop.
 * 
 *         Usually, break and continue keywords breaks/continues the innermost
 *         for loop only.
 * 
 *         Syntax:
 * 
 *         labelname: for(initialization;condition;incr/decr){ //code to be
 *         executed }
 */
public class LoopFor {
	public void simpleForLoop() {
		System.out.println("Output of Simple For Loop");
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
	}

	public void nestedForLoop() {
		System.out.println("Output of Nested For Loop");
		// loop of i
		for (int i = 1; i <= 3; i++) {
			// loop of j
			for (int j = 1; j <= 3; j++) {
				System.out.println(i + " " + j);
			} // end of i
		} // e
	}

	public void forEachLoop() {
		System.out.println("Output of For Each Loop");
		// Declaring an array
		int arr[] = { 12, 23, 44, 56, 78 };
		// Printing array using for-each loop
		for (int i : arr) {
			System.out.println(i);
		}
	}

	public void labledForLoop() {
		System.out.println("Output of Labled For Loop");
		// Using Label for outer and for loop
		aa: for (int i = 1; i <= 3; i++) {
			bb: for (int j = 1; j <= 3; j++) {
				if (i == 2 && j == 2) {
					break aa;
				}
				System.out.println(i + " " + j);
			}
		}
	}

	public void infiniteForLoop() {
		System.out.println("Output of Infinite For Loop");
		// Using no condition in for loop
		for (;;) {
			System.out.println("infinitive loop");
		}
	}

	public static void main(String[] args) {
		LoopFor obj=new LoopFor();
		obj.simpleForLoop();
		obj.nestedForLoop();
		obj.forEachLoop();
		//obj.infiniteForLoop(); //Press STOP button at the top to exit.
		obj.labledForLoop();
	}
}
