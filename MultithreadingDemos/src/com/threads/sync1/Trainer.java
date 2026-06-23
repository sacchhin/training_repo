package com.threads.sync1;

public class Trainer {
	
	private String name;

	public Trainer(String name) {
		super();
		this.name=name;
	}

	String AskDoubts(String studnetName, String question) {
		System.out.println("Student name :" +studnetName);
		System.out.println("question :" +question);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		String answer = question + "answered for you";
		System.out.println(answer);
		return answer;
	}

}
