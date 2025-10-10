package com.basics.quest3;

public class Student {

	String name;
	String department;
	
	Student(String name,String Department){
		this.name=name;
		this.department=department;
	}
	
	void printDetails() {
		System.out.println("Name :" +name);
		System.out.println("Department :" +department);
	}
	
	String getGrades(int [] marks) {
		int sum=0;
		for(int val:marks) {
			sum+=val;
		}
		
		double average = sum / marks.length;
		
		String grade;
		
		if(average>=90 && average<=100)
		grade="A";
		else if(average>=80)
		grade ="B";
		else if(average>=70)
		grade ="C";
		else if(average>=60)
		grade ="D";
		else if(average>=50)
		grade ="E";
		else
			grade ="fail";
		
		System.out.println("Total Marks :" + sum);
		System.out.println("Average :" +average);
		System.out.println("Grade :" +grade);
		
		return grade;
			
	}
}
