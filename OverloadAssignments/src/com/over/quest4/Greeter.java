package com.over.quest4;

public class Greeter {

	String name;
	
	void Greeter(String name){	
		this.name=name;	
		System.out.println(name);
	}
	void greetUser(String... messages) {
		for(String mess : messages) {
			System.out.println(messages + name);
		}
	}		
	void sayHello(String... names) {
		for(String n : names) {
			System.out.println(names +"Welcome" +name);
		}
	}
}
