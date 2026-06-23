package com.oops.bean1;

public class Employee {
	
	private String empname;
	private int empid;
	private double salary;
	private boolean married;
	
	
	
	public boolean isMarried() {
		return married;
	}
	public void setMarried(boolean married) {
		this.married = married;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [empname=" + empname + ", empid=" + empid + ", salary=" + salary + ", married=" + married
				+ "]";
	}
	
	
	

}
