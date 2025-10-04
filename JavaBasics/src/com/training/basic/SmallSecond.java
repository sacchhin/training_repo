package com.training.basic;

public class SmallSecond {
	
	public static void main(String[] args) {
		
		int nums[] = {40, 34, 56, 16, 67};
		
		int smallest1=nums[0];
		
		int smallest2=nums[0];
		for(int i=1; i<nums.length; i++) {
			
			if(nums[i]<smallest1)
			{
				smallest2=smallest1;
				smallest1=nums[i];
			}
				else if(nums[i]<smallest2 && nums[i]!=smallest1);
				{
					nums[i]=smallest2;
				}
				}
		System.out.println(smallest2);
			}
	
}


