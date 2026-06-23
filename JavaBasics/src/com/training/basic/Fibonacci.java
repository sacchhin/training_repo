package com.training.basic;

public class Fibonacci {
	
	public static void main(String[] args) {
		
		int num =14;
		
		int first=0 ,  second = 1;
		
		System.out.println(first + " " + second);
		for (int i=2; i<num; i++) {
			
			int next =first + second;
			
			System.out.println(next);
			first = second;
			second = next;
		}
		
	}

}
