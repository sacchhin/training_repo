package com.oops.overload;

public class ThisDemo {

	public ThisDemo() {
		System.out.println("Hello");
	}
	
	public ThisDemo(String name) {
		System.out.println("welcome :"+name);
	
	}
	public ThisDemo(int x){
		System.out.println("val:" +x);
	}

	
	public static void main(String[] args) {
		
		ThisDemo thisdemo = new ThisDemo();
	}
}
 
