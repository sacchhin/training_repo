package com.oops.override1;

public class Backend extends Course {

	@Override
	String[] showCourses() {
		
	return new String[] {"java","spring","boot"};
		
	}
	
}
