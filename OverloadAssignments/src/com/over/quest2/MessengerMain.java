package com.over.quest2;

public class MessengerMain {
	
	public static void main(String[] args) {
		
	Messenger messenger = new Messenger();
	
	messenger.sendMail("Happy Birthday and Be Happy");
	messenger.sendMail("Abhishek","Happy Birthday and Be Happy");
	messenger.sendMail("Birthday","Abhishek","Be Happy");
	
	}
}
