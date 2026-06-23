package com.inter.basics;

public class Vehicle implements IInsurance {

	@Override
	public void getPolicyDetails() {
		System.out.println("policy for parts");

	}
	
	void printMileage() {
		System.out.println("Mileage is good");
	}

}
