package com.collention.practice;

import java.util.HashMap;

public class MapImplementation {

	public static void main(String[] args) {
		HashMap<String, Integer> hashMap=new HashMap<String, Integer>();
		hashMap.put("Fe", 3);
		hashMap.put("H", 3);
		hashMap.put("0", 1);
		hashMap.put("H", 5);
		
		System.out.println(hashMap.containsKey("H"));
		
	}
}
