package com.javalive.controlStatementsPrograms;

public class LoopForPyramidExample2 {
	public void downwardRightAngleTraigle() {
		int term=6;  
		for(int i=1;i<=term;i++){  
		for(int j=term;j>=i;j--){  
		        System.out.print("* ");  
		}  
		System.out.println();//new line  
		}  
	}

	public static void main(String[] args) {
		LoopForPyramidExample2 obj=new LoopForPyramidExample2();
		obj.downwardRightAngleTraigle();
	}
}
