package com.oops.abs1;

public class Branch1 extends Bank {

	@Override
	void carLoan() {
		System.out.println("CAR LOAN IN branch1");
	}

	@Override
	void eduLoan() {
		System.out.println("bank LOAN IN branch1");

	}

	@Override
	void housingLoan() {
		System.out.println("house LOAN IN branch1");

	}
	
	//own method
	void depostTypes() {
		System.out.println("fixed,recrring,short");
	}

}
