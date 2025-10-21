package com.over.quest1;

public class Employee {
	
	String name,designation;

	public Employee(String name, String designation) {
		super();
		this.name = name;
		this.designation = designation;
		
		System.out.println(name);
		System.out.println(designation);
	}
	
	void calcBonus(double basicAllowance) {
		System.out.println("Your Basic Allowance :" +basicAllowance);
	}
	
	void calcBonus(double basicAllowance,String gift) {
		System.out.println("you have won gift : " +gift);
	}
	
	void calcBonus(double basicAllowance,String gift,double houseAllowance) {
		System.out.println("with Houseallowance :"+houseAllowance);
	}

}
