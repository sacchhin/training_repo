package com.inter.ex1;

public abstract class Employee implements IInsurance {

	private String employeeName;
	private int employeeId;
	private String city;
	
	
	public Employee(String employee, int employeeId, String city) {
		super();
		this.employeeName = employeeName;
		this.employeeId = employeeId;
		this.city = city;
	}
	
	void printDetails() {
		System.out.println("Name:" +employeeName );
		System.out.println("EmpID:"+employeeId);
		System.out.println("City:" +city);
	}
	
	 abstract void projectDetails();
	 abstract void calcBonus(double amount);
	
}
