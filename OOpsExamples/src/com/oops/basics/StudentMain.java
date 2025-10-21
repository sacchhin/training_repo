package com.oops.basics;

public class StudentMain {
	
public static void main(String[] args) {
		
		Student std = new Student();
		
		//Assign values
		std.name="darsh";
		std.department="E&C";
		std.stdId=34;
		
		//Calling through method using this()
		std.getDetails();
		
		//calling a return type method case 1;
		String result = std.greet();
		System.out.println(result);
		
		double avg = std.printAvg(3, 5);
		System.out.println(avg);
		
		//case 2;using casting
		
		int average = (int)std.printAvg(56, 7);
		System.out.println(average);
		
	}

}
