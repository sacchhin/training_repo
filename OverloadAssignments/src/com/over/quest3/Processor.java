package com.over.quest3;

public class Processor {

	void calculate(double x) {
		System.out.println("Squareroot :" +Math.sqrt(x));
	}
	
	void calculate(double x,double y) {
		System.out.println(x-y);
	}
	
	void calculate(double x, int y) {
		System.out.println("Power of" +Math.pow(x, y));
	}
	
	void calculate(int x, int y) {
		System.out.println("Product " +x*y);
	}
	
	void calculate(int x) {
		System.out.println("square" +x*x);
	}
}

