package com.over.quest4;

public class GreeterMain {

	public static void main(String[] args) {
		
		Greeter greeter = new Greeter();
		
		greeter.greetUser("welcome" , "Great Day");
		
		greeter.greetUser("Good day", "Have Tea", "Enjoy learning");
		
		Greeter greeter1 = new Greeter();
		
		greeter1.sayHello("sri" , "Priya");
		greeter1.sayHello("Sara","Anna","Reena","Rohan");
		greeter1.sayHello("Jo","Roni");
	}

}
