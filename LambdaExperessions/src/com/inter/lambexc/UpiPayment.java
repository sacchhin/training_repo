package com.inter.lambexc;

public class UpiPayment implements IPayment {

	@Override
	public String processPayment(double amount) {
		System.out.println(amount);
		if(amount>5000)
			return "failed";
		return "Success";
	}

}
