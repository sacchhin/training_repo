package com.inter.lambexc;

public class CardPayment implements IPayment {

	@Override
	public String processPayment(double amount) {
		System.out.println("Payment using card:" +amount);
		return "sucess";
	}

	
}
