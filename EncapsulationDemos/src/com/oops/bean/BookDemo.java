package com.oops.bean;

public class BookDemo {

	public static void main(String[] args) {
		
		Book book = new Book();
		
		book.setTitle("My Autograph");
		book.setBookid(4);
		book.setPrice(3000);
		book.setAvailable(true);
		
		System.out.println(book.getTitle());
		System.out.println(book.getBookid());
		System.out.println(book.getPrice());
		System.out.println(book.isAvailable());
		
		System.out.println(book);
	}

}
