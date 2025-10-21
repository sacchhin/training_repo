package com.oops.basics;

public class Product {

	String name;
	double price;
	String brand;
	int id;
	
	Product(String name, double price,String brand,int id){
		this.name=name;
		this.price=price;
		this.brand=brand;
		this.id=id;
		
	}
	
	String [] showModels(String brand) {
		
		String arr [] = {"S11","S12","A11"};
		return arr;
	}
	
	void printprd() {
		System.out.println(name +" "+ price +" "+  brand +" "+ id);
	}
	
}
