package com.oops.exercises;

public class Showroom {

	public static void main(String[] args) {
		
		Vehicle vehicle = new Car("Honda" ,"City",10900,"Blue","sedan");
		vehicle.printDetails();
		vehicle.getMileage();
		
		//downcasting to car ref
		Car car = (Car)vehicle;
		//own method of car class
		car.carInfo();
		String [] accessories = car.showAccessiories();
		if(accessories!= null) {
			for(String acc : accessories) {
				System.out.println(acc);
			}
		}

		Bikes bike = new Bikes("TVS","apache",13000,400,1,false);
		  bike.bikeInfo();
		
		Bikes bikes = (Bikes)vehicle;
		//
		bikes.bikeInfo();
		String[] Brands = bikes.showBrands("sports");
		if(Brands!=null) {
			for(String Brnd : Brands) {
				System.out.println(Brnd);
			}
			bike.getMileage();
		}
		
	}

}
