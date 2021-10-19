package com.javalive.controlStatementsPrograms;


/*Here we will write a java program that checks whether the given number is Armstrong number or not. We will see the two variation of the same program. In the first program we will assign the number in the program itself and in second program user would input the number and the program will check whether the input number is Armstrong or not.

Before we go through the program, lets see what is an Armstrong number. A number is called Armstrong number if the following equation holds true for that number:

xy..z = xn + yn+.....+ zn
where n denotes the number of digits in the number

For example this is a 3 digit Armstrong number

370 = 33 + 73 + o3
         = 27 + 343 + 0
         = 370
Let’s write this in a program:*/
	
public class CheckArmstrongNumber {
	public static void main(String[] args) {

        int num = 370, number, temp, total = 0;

        number = num;
        while (number != 0)
        {
            temp = number % 10;
            total = total + temp*temp*temp;
            number /= 10;
        }

        if(total == num)
            System.out.println(num + " is an Armstrong number");
        else
            System.out.println(num + " is not an Armstrong number");
    }
}
