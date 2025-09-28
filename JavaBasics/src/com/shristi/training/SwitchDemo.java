package com.shristi.training;

public class SwitchDemo {

	public static void main(String[] args) {
		
		String day ="sunday";
		
		switch(day.toUpperCase()) {
		case "SUNDAY":
			System.out.println("enjoying weekend");
			break;
		case "SATURDAY":
			System.out.println("enjoying weekend");
			break;
		case "MONDAY":
			System.out.println("gloomy days for startig work");
			break;
		case "THURSDAY": 
		case "WEDNEDAY":
		case "FRIDAY":
			System.out.println("Busy day");
			break;
			default :
				System.out.println("Wronf choice");
		}

	}

}
