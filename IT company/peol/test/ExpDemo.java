package com.peol.test;

import java.io.EOFException;

public class ExpDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.exit(0);
			int d=10/0;
			System.out.println(d);
		}catch(Exception e) {
			e.printStackTrace();
			
		}
		finally {
			System.out.println("hello");
			
		}
		System.out.println("hiii");
	}

}
