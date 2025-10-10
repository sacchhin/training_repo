package com.basics.quest3;

import java.util.*;

public class StudentMain {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=1; i<2; i++) {
			System.out.println("Enter Student name :");
			String stdname = sc.nextLine();
			
			System.out.println("Enter Department :");
			String dept = sc.nextLine();
			
			System.out.println("Enter number of subjects :");
			int n=sc.nextInt();
			
			int [] marks = new int[n];
			
			for (int j=0; j<n; j++) {
				marks[j]=sc.nextInt();
			}
			sc.nextLine();
			
			Student std = new Student(stdname,dept);
			std.printDetails();
			std.getGrades(marks);
		}
		
		
		
	}

}
