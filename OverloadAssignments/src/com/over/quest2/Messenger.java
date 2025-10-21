package com.over.quest2;

public class Messenger {
	
	void sendMail(String message) {
		System.out.println("You have a Message : "+message);
	}
	
	void sendMail(String tousername,String message) {
		System.out.println("To User :" +tousername);
	}
	
	void sendMail(String subject,String tousername,String message) {
		System.out.println("Subject : "+subject);
	}

}
