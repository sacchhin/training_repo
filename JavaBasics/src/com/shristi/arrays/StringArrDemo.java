package com.shristi.arrays;

public class StringArrDemo {
	public static void main(String[] args) {
		
		String name [] = new String[3];
		
		name[0] ="Ajeet";
		name[1] ="Anil";
		name[2] ="Aman";
		
		for(int i=0; i<name.length; i++)
		{
			System.out.println(name[i].toUpperCase());
		}
		
		for(String names1:name)
			System.out.println(names1.toUpperCase());
	}

}
