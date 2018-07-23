package com.collection.metthod;

import java.util.*;

public class AllMethod {
	

	public static void main(String[] args) {
		HashMap<String, Integer> map=new HashMap<String, Integer>();
		map.put("k1", 1);
		map.put("k2", 2);
		map.put("k3", 3);
		map.put("k4", 4);
		Set set=map.entrySet();
		System.out.println(set);
		boolean b=map.containsKey("k4");
		System.out.println(b);
		boolean b1=map.containsKey("k5");
		System.out.println(b1);
		boolean b2=map.containsValue(4);
		System.out.println(b2);
		
		System.out.println(map.equals(map));
		Set<String> set1=map.keySet();
		System.out.println(set1);
		Integer b4=map.remove("k5");
		System.out.println(b4);
		System.out.println(map.size());
		Iterable<Integer> set2=map.values();
		System.out.println(map.isEmpty());
		map.clear();
		System.out.println(map.isEmpty());
		
		}

}
