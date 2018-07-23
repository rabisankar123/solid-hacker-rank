package com.hacker.solve;

import java.util.Scanner;

public class CountString {
	public static void addLineNo(String [] strarr) {
		String res="";
		for (int i = 0; i < strarr.length; i++) {
			System.out.println(i+1+" "+strarr[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String[] strarr=new String[3];
		System.out.println("Enater value of n :");
		int n=sc.nextInt();
		for (int i = 0; i < n; i++) {
			
			String str=sc.nextLine();
			strarr[i]=str;
			
		}
		addLineNo(strarr);
	}

}
