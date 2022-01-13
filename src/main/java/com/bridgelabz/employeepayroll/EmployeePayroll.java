package com.bridgelabz.employeepayroll;

public class EmployeePayroll {
	int id;
	String name;
	double salary;
	
	
	public EmployeePayroll(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "EmployeePayRollData [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
}
