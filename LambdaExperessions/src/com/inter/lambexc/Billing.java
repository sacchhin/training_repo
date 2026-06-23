package com.inter.lambexc;

public class Billing {

	public static void main(String[] args) {
		
		Orders orders = new Orders();
		
		//crate a ref for Ipayment
		IPayment payment = new UpiPayment();
		orders.processOrders(payment, 1200, 5);
		System.out.println();
		
		payment = new CardPayment();
		orders.processOrders(payment, 1200, 2);
		System.out.println();
		
		System.out.println("Using Lambda");
		IPayment upipayment = amount ->{
			System.out.println("Payment using card:" +amount);
			if(amount>5000)
				return "Failed";
			return "sucess";
		};
		
		orders.processOrders(upipayment,1200, 2);
		System.out.println();
		
		orders.processOrders(amount->{
			System.out.println(" Payment using card "+amount);
			return "success";
		}
		, 1200, 90);
		
		

	}
	
}

