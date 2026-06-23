package com.inter.basics;

public class InterMain {

	public static void main(String[] args) {
		
		IInsurance iInsurance = new Vehicle(); //This is for calling Interface methods
		iInsurance.getPolicyDetails();
		
		iInsurance = new Mobile(); //This is for calling Interface methods
		iInsurance.getPolicyDetails(); 
		
		Mobile mobile = (Mobile) iInsurance; //for calling their own methods
		mobile.showApps();
		
		Vehicle vehicle = (Vehicle) iInsurance;
		vehicle.printMileage();
		
		
		
	}
}
