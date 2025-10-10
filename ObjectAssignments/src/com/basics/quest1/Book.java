package com.basics.quest1;

public class Book {

	String title,author,category;
	double price;
	
	Book(String title,double price,String author,String category){
		this.title=title;
		this.author=author;
		this.category=category;
		this.price=price;
	}
	
	void getDetails() {
		
		System.out.println(title + " " + author + " " + category + " " + price);
	}
	
	void checkBookType() {
		if(price>500) {
			System.out.println("Purchased Premium Book");
		}
		else {
			System.out.println("Purchased Standard Book");
		}
	}
	
}
