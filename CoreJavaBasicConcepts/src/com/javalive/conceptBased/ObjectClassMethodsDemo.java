package com.javalive.conceptBased;

class Employee {
	private int id;
	private String name;

	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		//return "Employee [id=" + id + ", name=" + name + "]";
		return("Hi I am "+this.name+" my employee ID is "+this.id);
	}
}
public class ObjectClassMethodsDemo {
	public static void main(String[] args) {
		Employee emp = new Employee(10,"EmpName1");
		System.out.println(emp.toString());
	}
}
