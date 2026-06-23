package com.thread.ex;

class Runner implements Runnable{
	
	String name; 

	public Runner(String name, int priority) {
		super();
		this.name = name;
		Thread thread = new Thread(this,name); //here this, name is used by run method of runner class not run method from thread class
		thread.setPriority(8);
		thread.start();
		
	}

	@Override
	public void run() {
		System.out.println("In Run");
		
	Greeter greeter = new Greeter();
	System.out.println(greeter.greetUser(name));
		
	}
	
}

public class MainRunDemo {
	
	public static void main(String[] args) {
		
		Runner runner1 = new Runner("Thread-1", 4);
		Runner runner2 = new Runner("Thread2" ,5);
		Runner runner3 = new Runner("Thread3" ,6);
		
		
	}

}
