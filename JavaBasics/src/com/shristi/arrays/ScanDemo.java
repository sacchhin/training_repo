package com.shristi.arrays;

import java.util.Scanner;

public class ScanDemo {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter name");
		String name = sc.nextLine();
		System.out.println(name);
		
		System.out.println("Enter id");
		int id = sc.nextInt();
		System.out.println(id);
		sc.nextLine();
		
		System.out.println("Enter City");
		String City = sc.next();
		System.out.println(City);
		
		System.out.println("Enter Salary");
		Double Salary = sc.nextDouble();
		System.out.println(Salary);
		
	}

}
