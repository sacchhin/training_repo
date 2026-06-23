package com.concurrency.basics;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ConcurrentDemo {
	
	public static void main(String[] args) {
		//create a thread pool using executors
		ExecutorService service= Executors.newFixedThreadPool(10);
		
		for(int i=0; i<50; i++) {
			service.execute(()->{
				System.out.println(Thread.currentThread().getName()+ " ");
			});
		}
			service.shutdown();
		
	}

}
