package com.company.test;

import java.util.Scanner;

public class UpperCase {
	public static void convrtUpperCase(String str) {
		String res="";
		char [] ch=str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if(str.charAt(i)>=97&&str.charAt(i)<=123) {
				char value=(char) (ch[i]-32);
				res+=value;
			}
			else {
				res+=str.charAt(i);
			}
		}
		System.out.println(res);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String value :");
		String str=sc.nextLine();
		convrtUpperCase(str);

	}

}
