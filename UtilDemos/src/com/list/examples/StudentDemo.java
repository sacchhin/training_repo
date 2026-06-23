package com.list.examples;

import java.util.ArrayList;
import java.util.Iterator;

public class StudentDemo {

	public static void main(String[] args) {
		
		ArrayList<Student> students = new ArrayList<Student>();
		
		Student student = new Student();
		
		students.add(new Student("Rohan",1,"bengal"));
		
		students.add(new Student("Raju",2,"bengal"));
		
		Iterator<Student> it = students.iterator();
		while(it.hasNext()) {
			 Student str =it.next();
			System.out.println(str);
		}

	}

}
