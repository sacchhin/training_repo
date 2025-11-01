package com.oops.override1;

public class courseoverride {
	
	public static void main(String[] args) {
		
		Course course = new Backend();
		course.showCourses();
		String[] backend = course.showCourses();
		for(String back : backend) {
			System.out.println(back);
		}
	
		
		course = new Frontend();
		course.showCourses();
		
		String[] frontend = course.showCourses();
		for(String front : frontend) {
			System.out.println(front);
		}
		
		
		course = new Course();
		course.printDetails();
		}

}
