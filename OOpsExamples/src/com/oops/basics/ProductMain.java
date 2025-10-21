package com.oops.basics;

public class ProductMain {
	
	public static void main(String[] args) {
		
		Product prd = new Product("raj",2345,"Nokia",45);
		
		prd.printprd();
		
		String [] com = prd.showModels("Nokia");
		for(String val:com) {
			System.out.println(val);
		}
	}

}
