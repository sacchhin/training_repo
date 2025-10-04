package com.training.basic;

public class LargeSecond {
	public static void main(String[] args) {
		
		int nums[] = {40, 34, 56, 16, 67};
		
		int Largest1=nums[0];
		
		int Largest2=nums[0];
		for(int i=1; i<nums.length; i++) {
			
			if(nums[i]>Largest1)
			{
				Largest2=Largest1;
				Largest1=nums[i];
			}
				else if(nums[i]>Largest2 && nums[i]!=Largest1);
				{
					nums[i]=Largest2;
				}
				}
		System.out.println(Largest2);
	}

}