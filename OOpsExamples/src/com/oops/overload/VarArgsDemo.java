package com.oops.overload;

public class VarArgsDemo {
	
	void calcSum(String name) {
		System.out.println("hello");
	}
	
	//Java5
	void calcSum(String name,int... marks) {
		System.out.println("Wlcome" +name);
		System.out.println(marks.length);
		int sum=0;
		for (int mark : marks) {
			sum+=mark;
		}
		System.out.println("Sum:" +sum);
	}
	
	public static void main(String[] args) {
		
		VarArgsDemo var = new VarArgsDemo();
		var.calcSum("Raju"); 
		var.calcSum("Raju", 20,30,40);
		var.calcSum("Raju", 20,30,40,56,78);
	}

}
