package com.inter.example1;

public class MiniBusService extends BusService {

	@Override
	public void cancelTicket(int noOfTickets) {
		System.out.println("Cancel ticket "+noOfTickets);

	}
	
	//ownmethod
	void festiveOffers() {
		System.out.println("Special booking avaiable");
	}

}
