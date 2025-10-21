package com.oops.exercises;

public class Bikes extends Vehicle {
	 int cc;
	 int ignitionType;
	 boolean isGearless;
	public Bikes(String brand, String model, double price, int cc, int ignitionType, boolean isGearless) {
		super(brand, model, price);
		this.cc = cc;
		this.ignitionType = ignitionType;
		this.isGearless = isGearless;
	}
	@Override
	void getMileage() {
		if(isGearless)
			System.out.println("Mileage is ok");
		else
			System.out.println("Better mileage");
	}
	
	String [] showBrands(String type) {
		if(type.equals("sports"))
				return new String [] {"Ducati"};
		else if(type.equals("Regular"))
			return new String [] {"Honda","Bajaj"};
		else
			return null;
	}
	
	void bikeInfo() {
		printDetails();
		System.out.println("cc :" +cc);
		System.out.println("IgnitionType :" +ignitionType);
	}
	 
}
