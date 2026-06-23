package com.thread.basic;

public class MainThread {
	
	public static void main(String[] args) {
		
		Thread t = Thread.currentThread();
		System.out.println(t);
		 
		t.setName("Pop"); //naming the thread
		System.out.println(t);
	}

}
