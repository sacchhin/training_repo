package com.map.examples;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapDemo {
	
	public static void main(String[] args) {
		
		Map<String, List<String>> map = new HashMap<String, List<String>>();
		map.put("Karnataka", List.of("Bengaluru","Mysore","Hubli"));
		map.put("Kerala", List.of("Kochi","Thrissur","wayand"));
		map.put("Andhra", List.of("hyderbad","tirupati","kurnool"));
		
		for(Map.Entry<String, List<String>> entry : map.entrySet()) {
			System.out.println("States " +entry.getKey());
			System.out.println("Cities " +entry.getValue());
		}
		
	}

}
