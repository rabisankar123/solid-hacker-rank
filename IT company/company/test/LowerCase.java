package com.company.test;

import java.util.Scanner;

public class LowerCase {
	public static void convrtLowerCase(String str) {
		String res="";
		char [] ch=str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if(str.charAt(i)>=65&&str.charAt(i)<=91) {
				char value=(char) (ch[i]+32);
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
		convrtLowerCase(str);
		sc.close();
	}


}
