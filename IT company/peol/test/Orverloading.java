package com.peol.test;

public class Orverloading {
	public static double Sum(double a, double b) {
		System.out.println("hi");
		return a+b;
	}
	public static int Sum(int a, int b) {
		System.out.println("helo");
		if(a>=0&&b>=0) {
			return a+b;
		} else {
			ArithmeticException ae=new ArithmeticException();
			throw ae;
		}
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Sum(0,-2));
	}

}
