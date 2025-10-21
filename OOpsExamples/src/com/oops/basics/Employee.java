package com.oops.basics;

public class Employee {
	
	String empName;
	int empId;
	double salary;
	
	public static void main(String[] args) {
		
		Employee emp = new Employee();
		//System.out.println(emp.empName+" "+emp.empId+" "+emp.salary);
		
		//Assign Values
		emp.empName="Sarvan";
		emp.empId=450;
		emp.salary=4500;
		
		//System.out.println(emp.empName+" "+emp.empId+" "+emp.salary);
		
		Employee emp1 = new Employee();
		
		//assign values
		emp1.empName="rajesh";
		emp1.salary=3450;
		emp.empId=451;
		
		System.out.println(emp1.empName+" "+emp1.empId+" "+emp1.salary);
		
		
		Employee emp2=emp1;
		
		System.out.println(emp2.empName+ " " +emp2.empId);
		emp2.empName="darshan";
		System.out.println(emp1.empName);
		System.out.println(emp2.empName);
		
		//make emp1 as null
		emp1=null;
		System.out.println(emp2.empName);
		System.out.println(emp1.empName);
		
	}

}
