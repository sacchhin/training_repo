package com.thread.ex;

class Child extends Thread {
	
	String name;

	Child(String name, int priority){
		super(name);
		this.name = name;
		this.setPriority(priority);
		this.start();
		
		}
		@Override
		public void run() {
			System.out.println("current thread" +name);
			System.out.println("In run");
		}
		
	}
	

//2 TIMES output its calling start and run method
public class Mainex {
	
	public static void main(String[] args) {
		
		Child t1 = new Child("Thread1", 6);
		Child t2 = new Child("Thread2", 6);
		Child t3 = new Child("Thread3", 6);
		
	}

}
