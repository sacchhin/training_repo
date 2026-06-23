package com.oops.overload;

public class vehicle {
	
	String model;
	String brand;
	double price;
	
	public vehicle() {
		
		System.out.println("In default const");
	}
	public vehicle(String model) {
		this();
		this.model = model;
		System.out.println("In one param");
	}

	public vehicle(String model, String brand) {
		this(brand);
		this.brand = brand;
		System.out.println("In 2 param");
	}
	
	public vehicle(String model, String brand, double price) {
		this(model, brand);
		this.price = price;
		System.out.println("In 3 param");
	}
	
	void getdetails() {
		System.out.println("Model" +model);
		System.out.println("Brand" +brand);
		System.out.println("price" +price);
	}

}
