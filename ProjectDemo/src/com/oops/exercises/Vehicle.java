package com.oops.exercises;

public class Vehicle {
	
	String brand;
	String model;
	double price;
	public Vehicle(String brand, String model, double price) {
		super();
		this.brand = brand;
		this.model = model;
		this.price = price;
	}
	//common method for all subclass
	void printDetails() {
		
		System.out.println("Model :" +model);
		System.out.println("Brand :" +brand);
		System.out.println("Price :" +price);
	}

	//own method
	void getMileage() {
		System.out.println("Vehicle mileage");
	}
}
