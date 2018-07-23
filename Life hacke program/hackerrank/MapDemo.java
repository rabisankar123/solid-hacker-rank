package com.hacker.solve;

import java.util.*;

public class MapDemo {

	public static void main(String[] args) {
		HashMap hm=new HashMap();
		hm.put("ravi", 101);
		hm.put("swag", 102);
		hm.put("sourav", 103);
		hm.put("arup", 104);
		System.out.println(hm);
		System.out.println(hm.put("ravi", 1001));
		HashMap hm1=new HashMap();
		hm1.putAll(hm);
		System.out.println(hm1);
		hm1.remove("sourav");
		System.out.println(hm1.get("ravi"));
		System.out.println(hm.containsKey(103));
		Set s1=hm.keySet();
		System.out.println(s1);
		Collection c=hm.values();
		System.out.println(c);
		Iterator<String> it=s1.iterator();
		while(it.hasNext())
		{
			System.out.println(hm.get(it.next()));
		}
		
	}

}
