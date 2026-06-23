package com.inter.extend;

public class BasicCalculator implements Icalculator {

	@Override
	public void add(int x, int y) {
		System.out.println("Sqr" + x+y);
	}

	@Override
	public void sub(int x, int y) {
		System.out.println("sub"+ (y-x));
	}
	
	

}
