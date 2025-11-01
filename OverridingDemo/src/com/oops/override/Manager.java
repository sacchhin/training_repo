package com.oops.override;

public class Manager extends Employee {

	@Override
	void calcBonus(double amount) {
		System.out.println("Mgr Bonus "+ amount*3);
	}


}
