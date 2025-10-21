package com.oops.basics;

public class Student {
	
	String name;
	String department;
	int stdId;
	
	void getDetails() {
		System.out.println(this.name);
		System.out.println(this.department);
		System.out.println(this.stdId);
	}
	
	String greet(){
		
		return "Have a great day";
	}
	
	double printAvg(int marks1, int marks2) {
		
		int sum = marks1+marks2;
		double avg =sum/2;
		return avg;
	}
}
