package com.threads.sync1;

public class Institute {
	
	public static void main(String[] args) {
		
		Trainer trainer = new Trainer("RAj");

		TrainingRoom student1 = new TrainingRoom("Raj","what is java", trainer);
		TrainingRoom student2 = new TrainingRoom("Rahul","what is python", trainer);
		TrainingRoom student3 = new TrainingRoom("Rakesh","what is thread", trainer);
		
	}

}
