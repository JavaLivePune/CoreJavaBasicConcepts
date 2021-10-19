package com.javalive.mostBasic;

public class CopyConstructorDemo {
	private double re, im; 
	private String name;
    
    // A normal parameterized constructor  
    public CopyConstructorDemo(double re, double im, String name) { 
        this.re = re; 
        this.im = im; 
        this.name=name;
    } 
      
    // copy constructor 
    CopyConstructorDemo(CopyConstructorDemo c) { 
        System.out.println("Copy constructor called"); 
        re = c.re; 
        im = c.im; 
        name=c.name;
    } 
       
    // Overriding the toString of Object class 
    @Override
    public String toString() { 
        return "(" + re + " + " + im + " "+name+"i)"; 
    } 
    public static void main(String[] args) { 
    	CopyConstructorDemo c1 = new CopyConstructorDemo(10, 15, "Name"); 
          
        // Following involves a copy constructor call 
    	CopyConstructorDemo c2 = new CopyConstructorDemo(c1);    
  
        // Note that following doesn't involve a copy constructor call as  
        // non-primitive variables are just references. 
    	CopyConstructorDemo c3 = c2;    //Shallow copy
  
        System.out.println(c2); // toString() of c2 is called here
        
        System.out.println(c3); // toString() of c3 is called here 
    } 
}
