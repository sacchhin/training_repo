package com.list.examples;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {
	
	public static void main(String[] args) {
		
	Set<String> myset = new HashSet<String>();
	
	myset.add("apple");
	myset.add("app");
	myset.add("Orange");
	System.out.println(myset.size());
	System.out.println(myset);
	
	myset.add("Kiwi");
	myset.add("mango");
	
	Iterator<String> it = myset.iterator();
	while(it.hasNext()) {
		 String str =it.next();
		System.out.println(str.toLowerCase());
	}
	
	
	}
	
}
