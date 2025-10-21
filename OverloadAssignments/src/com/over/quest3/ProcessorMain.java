package com.over.quest3;

public class ProcessorMain {

	public static void main(String[] args) {
		
		Processor processor = new Processor();
		
		processor.calculate(4);
		processor.calculate(3.4, 4);
		processor.calculate(5);
		processor.calculate(4.7, 7);
		processor.calculate(4, 3);
	}

}
