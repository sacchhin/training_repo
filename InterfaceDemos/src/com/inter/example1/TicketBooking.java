package com.inter.example1;

public class TicketBooking {

	public static void main(String[] args) {
		
		IBooking ibooking = null;
		System.out.println("agencyname "+ibooking.AGENCYNAME);
		
		IBooking iBooking = new FlightService();
		iBooking.bookTicket(8);
		iBooking.cancelTicket(5);
		
		FlightService flightService = (FlightService)iBooking;
		flightService.showFacilites();
		
		iBooking = new TrainService();
		iBooking.bookTicket(9);
		iBooking.cancelTicket(8);
		
		
		TrainService trainService =(TrainService) iBooking;
		trainService.showFacilites();

		iBooking = new MiniBusService();
		iBooking.bookTicket(4);
		iBooking.cancelTicket(3);
		
		BusService busService = (BusService)iBooking;
		busService.applyDiscount();
		
		
		MiniBusService miniBusService =(MiniBusService)(busService);
		miniBusService.applyDiscount();
		
		miniBusService.festiveOffers();
	}

}
