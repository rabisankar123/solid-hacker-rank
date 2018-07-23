package com.company.test;

import java.util.Scanner;

public class BlnkSpace {
	public static String removingBlnkSpace(String str) {
		String res="";
		char [] ch=str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if(ch[i]!=' ')
			{
				res+=str.charAt(i);
			}
			
		}
		return res;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String value :");
		String str=sc.nextLine();
		System.out.println(removingBlnkSpace(str));
		sc.close();
	}


}
