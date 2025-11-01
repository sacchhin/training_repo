package com.oops.sup;

public class SupMain {
	
	public static void main(String[] args) {
		
		Vehicle vehicle = new Vehicle("At", " ytu" ,3456);
		vehicle.getDetails();
		
		Car car = new Car("At", " ytu" ,3456,"Green");
		car.getDetails();
	}

}
