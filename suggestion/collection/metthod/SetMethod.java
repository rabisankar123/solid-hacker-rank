package com.collection.metthod;

import java.util.*;

public class SetMethod {
	public static void main(String[] args) {
		HashSet<Integer> set=new HashSet<Integer>();
		set.add(1);
		set.add(2);
		set.add(3);
		
		System.out.println(set);
		boolean b=set.contains("kaka");
		System.out.println(b);
		Iterator<Integer> iterator=set.iterator();
		while (iterator.hasNext()) {
			Object object = (Object) iterator.next();
			System.out.println(object);
		}
		Object[] starr=set.toArray();
		for (int i = 0; i < starr.length; i++) {
			System.out.println(starr[i]);
		}
		
	}

}
