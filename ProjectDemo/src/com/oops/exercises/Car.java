package com.oops.exercises;

public class Car extends Vehicle {
	
	String color;
	String type;
	
	public Car(String brand, String model, double price, String color, String type) {
		super(brand, model, price);
		this.color = color;
		this.type = type;
	}

	@Override
	void getMileage() {
		//if type is sedan print the mileage
		System.out.println("Car mileage is good");
		//else if type is suv print the mileage
	}
	
	//own method
	String [] showAccessiories() {
		return new String [] {"car cover","rear a/c","music system"};
	}
	
	void carInfo() {
		System.out.println("Details of car");
		//print details
		printDetails(); //this prints model, brand price
		System.out.println("Color :" +color );
		System.out.println("type :" +type);
	}
	

}
