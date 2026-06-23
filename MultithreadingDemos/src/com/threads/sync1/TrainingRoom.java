package com.threads.sync1;

public class TrainingRoom implements Runnable {
	
	String studentname;
	String question;
	Trainer trainer;
	

	public TrainingRoom(String studentname, String question, Trainer trainer) {
		super();
		this.studentname = studentname;
		this.question = question;
		this.trainer= trainer;
		
		Thread t = new Thread(this,studentname);
		t.start();
	}


	@Override
	public void run() {
		synchronized (trainer) {
			System.out.println("IN run" +Thread.currentThread().getName());
			 System.out.println(trainer.AskDoubts(studentname, question));	
			 System.out.println("Doubts Cleard");
			
		}	 	
	}
}
