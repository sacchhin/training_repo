package com.basics.quest2;

public class Bank {
	
	double balance;
	
	Bank(double balance){
		this.balance=balance;
	}
	
	void Withdraw(double amount) {
		if(amount>0 && amount <=balance) {
		balance = balance-amount;
		System.out.println("success" +balance);
		}
		else if(amount > balance) {
			System.out.println("Insufficent Bal");
		}
		else{
			System.out.println("Invalid amount");
		}
	}

	void Deposit(double amount) {
		if(amount>0) {
		balance= balance+amount;
		System.out.println("deposited: " +balance);
		}
	}
}
