package com.training.scan;

import java.util.*;
public class ScanGreater {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter how many numbers");
		int n =sc.nextInt();
		
		System.out.println("Enter the  numbers");
		
		int nums [] = new int[n];
		
		for (int i=0; i<n; i++) {
			
			nums[i]= sc.nextInt();
			
		}
		int greatest= nums[0];
		
		for(int i=1; i<n; i++) {
			
			if(nums[i]>greatest) {
				greatest=nums[i];
			}
		}
		System.out.println(greatest);
		
		sc.close();
	}

}
