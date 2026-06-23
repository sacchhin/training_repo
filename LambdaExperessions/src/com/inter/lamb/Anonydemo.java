package com.inter.lamb;

public class Anonydemo {

	public static void main(String[] args) {
		
		// Interface ref = imp class
		ICalculator ref = new Addition();
		ref.calculate(10, 3);
		
		//anonymous class
		//Interface ref = new int_name();
		ICalculator calculator = new ICalculator() { //Implementation
			
			@Override
			public void calculate(int x, int y) {
				System.out.println(x+y);
			}
				
		};
		calculator.calculate(2, 2); //calling
	}
}
