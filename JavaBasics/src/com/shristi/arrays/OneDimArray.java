package com.shristi.arrays;

public class OneDimArray {
	
	public static void main(String[] args) {
		
		int [] nums = new int[4];
		
		
		System.out.println(nums.length);
		
		//populate or assign the values
		nums[0] = 90;
		nums[1] = 80;
		nums[2] = 40;
		nums[3] = 50;
	//	nums[4] = 60;  //ArrayIndexOutBoundException
		
		System.out.println(nums[0]);
		
	//	finding the sum 
		int sum=0;
		
		for(int i=0; i<nums.length; i++) {
			 sum =sum+nums[i];
			System.out.println("sum" +sum);
//			sum =nums[0] +nums[1] +nums[2] + nums[3];
		}
		
		//using for each
		
		for(int val:nums)
			//sum = sum+val;  
			sum+=val;
		System.out.println(sum);
	}

}
