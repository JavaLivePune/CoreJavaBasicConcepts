package com.javalive.controlStatementsPrograms;

public class LoopForPyramidExample1 {
	public void upwardRightAngleTraigle() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();// new line
		}
	}

	public static void main(String[] args) {
		LoopForPyramidExample1 obj=new LoopForPyramidExample1();
		obj.upwardRightAngleTraigle();
	}
}
