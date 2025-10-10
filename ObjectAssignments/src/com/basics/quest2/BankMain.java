package com.basics.quest2;

import java.util.*;

public class BankMain {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("intial Balance");
		double initialbal=sc.nextDouble();
		
		Bank bank = new Bank(initialbal);
		
		System.out.println("Please choose :");
		System.out.println("1.withdraw");
		System.out.println("2.deposit");
		System.out.println("enter the choice");
		int choice = sc.nextInt();
		
		switch(choice) {
		case 1:
			System.out.println("Please Enter the amount");
			double withdrawnamt = sc.nextDouble();
			bank.Withdraw(withdrawnamt);
			break;
		
		case 2:
			System.out.println("Please Enter the amount");
			double depoamount = sc.nextDouble();
			bank.Deposit(depoamount);
			break;
		
		default:
			System.out.println("Invalid");
		
		}
		
		sc.close();
	}

}
