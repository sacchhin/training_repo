package com.excep.usedefined;

public class HdATM {
	public static void main(String[] args) {
		
		
		Hdbank hdbank = new Hdbank(4000);
		
		try {
			hdbank.withdraw(1000);
		} catch (ExceedingLimitException e) {
			System.out.println("Problem occured:" +e.getMessage());
		} catch (MinBalanceException e) {
			System.out.println("Issue:" +e.getMessage());
			
		}
		
	}

}
