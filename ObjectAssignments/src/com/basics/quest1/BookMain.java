package com.basics.quest1;

public class BookMain {

	public static void main(String[] args) {
		
		Book book = new Book("Living Dreams",590.34,"Chetan Bhagath","Premium");
		
		book.getDetails();
		
		Book book1= new Book("Honey",2347.9,"Sandeep","Standard");
		
		book1.getDetails();
		
		book1.checkBookType();
	}
}
