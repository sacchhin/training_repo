package com.inter.lambexc;

public class Orders {
	
	void processOrders(IPayment payment,double cost, int qty) {
		System.out.println("Processing orders ..");
		double amount = cost*qty;
		System.out.println("amunt to be paid" +amount);
		
		String status =payment.processPayment(amount);
		if(status.equals("Success"))
			System.out.println("Order shipped");
		else
			System.out.println("payment failed");
		
	}

}
