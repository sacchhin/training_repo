package com.excep.usedefined;

public class Hdbank {
	
	double balance;

	public Hdbank(double balance) {
		super();
		this.balance = balance;
	}
	
	void withdraw(double amount)  throws ExceedingLimitException, MinBalanceException{
		System.out.println("In HD Bank");
		
		try {
			if(amount>5000)
				throw new ExceedingLimitException("Amount should be less then 5000");
				
			if (balance - amount <2000)
				throw new MinBalanceException("Min bal not maintianed");
			balance -=amount;
			System.out.println("Amount withdrawn successfully");
		} catch (Exception e) {
			System.out.println("Wrong output");
			throw e;
		}
			finally {
				System.out.println("Close the connection");
			}
		}
		}
	
	



