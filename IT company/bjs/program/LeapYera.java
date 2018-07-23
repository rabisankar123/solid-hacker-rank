package com.bjs.program;

public class LeapYera {
	public static boolean findYeapYear(int num) {
		if(num%4==0) {
			if(num%100==0) {
				if(num%400==0) {
					return true;
				}
			}
		}
		
		
		return false;
	}
	public static void main(String[] args) {
		boolean b=LeapYera.findYeapYear(1900);
		if(b) {
			System.out.println("It is leapyear");
		} else {
			System.out.println("It is not leapyear");
		}
	}

}
