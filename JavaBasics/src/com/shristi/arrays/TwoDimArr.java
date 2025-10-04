package com.shristi.arrays;

public class TwoDimArr {
	
	public static void main(String[] args) {
		
		int nums [][] = new int[3][4];
		
		nums[0][0] = 2;
		nums[0][1] = 4;
		nums[0][2] = 2;
		nums[0][3] = 8;
		
		nums[1][0] = 2;
		nums[1][1] = 5;
		nums[1][2] = 6;
		nums[1][3] = 4;
		
		nums[2][0] = 4;
		nums[2][1] = 6;
		nums[2][2] = 7;
		nums[2][3] = 10;
		
		for(int i=0; i<nums.length; i++) {
			for(int j=0; j<nums[i].length; j++) {
				
				System.out.println(nums[i][j]+" ");
			}
				//comes out after a row
				System.out.println( );
		}
			
				int sum=0;
				for(int i=0; i<nums.length; i++) {
					for(int j=0; j<nums[i].length; j++) {
				sum+=nums[i][j];
					}
				System.out.println( );
				}
				System.out.println(sum);
			}
		
		
	}


