package com.inter.example1;

public abstract class BusService implements IBooking {

	@Override
	public void bookTicket(int noOfTickets) {
		System.out.println("booking tickets");
		System.out.println("No of tickets booked : " +noOfTickets);
	}

	//ownmethod
	public void applyDiscount() {
		System.out.println("Festival Discount");
	}
	

}
