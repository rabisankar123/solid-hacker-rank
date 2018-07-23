package com.amiti.test;

public class Amiti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test="1a2b3c";
		String[] tokens=test.split("\\d");
		for (String s : tokens) {
			System.out.println(s+" ");
		}
	}

}
