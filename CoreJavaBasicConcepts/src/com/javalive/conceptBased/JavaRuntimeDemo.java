package com.javalive.conceptBased;

public class JavaRuntimeDemo {
	public static void main(String[] args) {
		// check the number of processors available
		System.out.println("" + Runtime.getRuntime().availableProcessors());

		
		/*try
        { 
            // create a process and execute google-chrome 
            Process process = Runtime.getRuntime().exec("google-chrome"); 
            System.out.println("Google Chrome successfully started"); 
        } 
        catch (Exception e) 
        { 
            e.printStackTrace(); 
        }*/ 
	}
}
