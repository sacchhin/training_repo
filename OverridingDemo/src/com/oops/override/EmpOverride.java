package com.oops.override;

public class EmpOverride {
	
	public static void main(String[] args) {
		
	
	//superclass ref = sub class object
	
	Employee emp=new Manager();
	
	//call the overridden method from manager
	emp.calcBonus(2000);
	emp.greet(); //own method of employee as its public 
	
	//call the overridden method from Dev
	emp = new Developer();
	emp.calcBonus(3000);
	
	emp = new Tester();
	emp.calcBonus(4000);
	
	emp = new Employee();
	emp.calcBonus(4000);
	
	}
}
