package com.oops.override;

public class Developer extends Employee {

	@Override
	void calcBonus(double amount) {
		System.out.println("Dev Bonus " +amount*6);
	}
	
	

}
