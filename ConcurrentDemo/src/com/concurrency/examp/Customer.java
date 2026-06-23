package com.concurrency.examp;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Runner implements Runnable{
	 
	 private Bank bank;
	 private String name;
	 private double amount;
	 

	public Runner( String name, double amount,Bank bank) {
		super();
		this.bank = bank;
		this.name = name;
		this.amount = amount;
	}


	@Override
	public void run() {
		System.out.println("Inside run");
		double interest= bank.calcInterest(name,amount);
		System.out.println(interest);
		bank.payBills("Wifi", 2000);
		
		
	}
	
}

public class Customer {

	public static void main(String[] args) {
		
		Bank bank = new Bank();
		//crate a  thread pool
		ExecutorService service = Executors.newFixedThreadPool(5);
		//pass the task
		service.execute(new Runner("Abhi", 5000 ,bank));
		
	}
}
