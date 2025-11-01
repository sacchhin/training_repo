package com.oops.sup;

public class Vehicle {
	
	String model;
	String brand;
	
	public Vehicle(String model, String brand, double price) {
		super();
		this.model = model;
		this.brand = brand;
		this.price = price;
	}

	double price;
	
	void getDetails() {
		
			System.out.println("Model" +model);
			System.out.println("Brand" +brand);
			System.out.println("Price" +price);
	}
	

}
