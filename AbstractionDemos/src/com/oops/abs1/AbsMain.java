package com.oops.abs1;

public class AbsMain {
	
	public static void main(String[] args) {
		
		Bank bank= new Branch1();
		
		bank.carLoan();
		bank.eduLoan();
		bank.adminDetails();
		bank.housingLoan();
		
		Branch1 branch1 =(Branch1)bank;
		branch1.depostTypes();
		
		bank = new subBranch();
		bank.carLoan();
		bank.eduLoan();
		bank.adminDetails();
		bank.housingLoan();
		
		subBranch sub = (subBranch)bank;
		sub.cardTypes();
		sub.loanTypes();
		
		Branch2 branch2 =(Branch2) bank;
		bank.adminDetails();
	}
}
