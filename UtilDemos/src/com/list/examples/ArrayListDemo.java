package com.list.examples;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		List mylist = new ArrayList();
		mylist.add("apple");
		mylist.add("app");
		mylist.add("Orange");
		System.out.println(mylist.size());
		System.out.println(mylist);
		mylist.add(10);
		mylist.add(19);
		mylist.add("Kiwi");
		mylist.add("mango");
		
		System.out.println(mylist);
		
		Iterator<String> it = mylist.iterator();
		while(it.hasNext()) {
			 String str =it.next();
			System.out.println(str.toLowerCase());
		}
		System.out.println(mylist.size());
		
		for(Object o :mylist) {
		String str =(String) o;
		System.out.println(str.toUpperCase());
		
		}
	}
}
