package com.hacker.solve;

import java.util.HashMap;

public class MapTry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, Integer> map=new HashMap<>();
		map.put(1, 222);
		map.put(2, 22);
		map.put(1, 111);
		System.out.println(map.entrySet());

	}

}
