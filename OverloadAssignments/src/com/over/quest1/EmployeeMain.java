package com.over.quest1;

public class EmployeeMain {

	public static void main(String[] args) {
		
		Employee employee = new Employee("Vivek" , "Engineer");
	
		
		employee.calcBonus(34000);
		employee.calcBonus(34000, "Watch");
		employee.calcBonus(34000, "Watch", 23000);
			
			
	}
}
