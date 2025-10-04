package com.training.basic;

public class Smaller {
	
	public static void main(String[] args) {
		
		 int [] nums = {10, 34, 45, 80, 46};
		 
		 int smallest = nums[0];
		 
		 for(int i=1; i<nums.length; i++) {
			 
			 if (nums[i]<smallest)
				 smallest=nums[i];
			 
		 }
		 
		 System.out.println(smallest);
	}

}
