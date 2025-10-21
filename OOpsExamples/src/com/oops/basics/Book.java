package com.oops.basics;

public class Book {
	
	String title;
	double price;
	String author;
	
	Book(String title,double price, String author){
		this.title=title;
		this.price=price;
		this.author=author;
		
	}

	void printInfo() {
		System.out.println(title + price + author);
	}
}
