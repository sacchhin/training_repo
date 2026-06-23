package com.excep.basics;

public class TryDemo {
	
	public static void main(String[] args) {
		System.out.println("Welcome");
		try {
		System.out.println("Enter Value");
		String val = args[0];
		System.out.println("Got val :" +val);
		int num = Integer.parseInt(val);
		System.out.println("nUMBER" +num);
		int result = 10/num;
		System.out.println("Result" +result);
		}catch(Exception e) {
			System.out.println("Error occeured");
			System.out.println(e);
		}
		System.out.println("Continue work flow");
	}

}
