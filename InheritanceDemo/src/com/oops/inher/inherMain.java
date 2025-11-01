package com.oops.inher;

public class inherMain {

	public static void main(String[] args) {
		
		Employee emp = new Employee();
		
		emp.empName = "Darsh";
		emp.empId = 34;
		emp.getDetails();
		
		Manager manager = new Manager();
		
		manager.empName ="vivek";
		manager.empId = 35;
		manager.salary = 10000;
		manager.calcBonus(5640.6);
		manager.getDetails();

	}

}
