package com.oops.bean;

public class Demo {

	static int x;
	static int y=100;
	
	static {
		System.out.println("In static block");
		x=30;
		System.out.println(x+y);
	}
	static void call() {
		System.out.println("hello");
	}
	
	public static void main(String[] args) {
		call();
	}
}
 
