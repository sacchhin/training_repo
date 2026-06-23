package com.inter.example1;

public class TrainService implements IBooking {

	@Override
	public void bookTicket(int noOfTickets) {
		System.out.println("booking tickets");
		System.out.println("No of tickets booked : " +noOfTickets);
	}

	@Override
	public void cancelTicket(int noOfTickets) {
		System.out.println("Cancelling tickets - no refund");
		System.out.println(" No of tickets cancelled :" +noOfTickets);

	}
	
	//own method
	void showFacilites() {
		System.out.println("Food provided");
	}

}
