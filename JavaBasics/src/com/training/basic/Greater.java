package com.training.basic;

public class Greater {

	public static void main(String[] args) {
		
		int [] nums = {10, 34, 45, 80, 46};
		
		int greatest = nums[0]; //assuming the greatest as first index
		
		for (int i=1; i<nums.length; i++) {
			
			if(nums[i]>greatest)
				greatest =nums[i];
		}
		
	System.out.println(greatest);
		
	}

}
