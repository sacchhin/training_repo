package com.oops.overload;

public class ThisDemo {

	public ThisDemo() {
		
		this("Priya");
		System.out.println("Hello");
	}
	
	public ThisDemo(String name) {
		this(10);
		System.out.println("welcome :"+name);
	
	}
	public ThisDemo(int x){
		System.out.println("val:" +x);
	}

	
	public static void main(String[] args) {
		
		ThisDemo thisdemo = new ThisDemo();
	}
}
 
