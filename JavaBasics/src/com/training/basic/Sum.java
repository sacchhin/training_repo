package com.training.basic;

public class Sum {
	
	public static void main(String[] args) {
		
		int nums[] = {12 ,45, 56, 78, 50, 34, 55};
		
		int sum=0;
		
		float avg=0;
		
		for(int i=0; i<nums.length; i++) {
			
			sum = sum+nums[i];
			avg = sum/nums.length;
		}
		System.out.println(sum);
		System.out.println(avg);
	}

}
