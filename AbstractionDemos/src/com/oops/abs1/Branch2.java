package com.oops.abs1;

public abstract class Branch2 extends Bank {

	@Override
	void eduLoan() {
		System.out.println("bank LOAN IN branch2");

	}

	@Override
	void housingLoan() {
		System.out.println("house LOAN IN branch2");

	}
	
	//own method
	void loanTypes() {
		System.out.println("Long,short");
	}

}
