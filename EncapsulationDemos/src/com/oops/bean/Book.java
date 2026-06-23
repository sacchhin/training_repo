package com.oops.bean;

public class Book {

	private String title;
	private double price;
	private int bookid;
	private boolean isAvailable;
	
	public void setTitle(String title) {
		this.title=title;
	}
	
	public String getTitle() {
		return title;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getBookid() {
		return bookid;
	}

	public void setBookid(int bookid) {
		this.bookid = bookid;
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", price=" + price + ", bookid=" + bookid + ", isAvailable=" + isAvailable
				+ "]";
	}
	
	
	
}

