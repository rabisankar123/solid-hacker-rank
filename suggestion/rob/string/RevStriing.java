package com.rob.string;

import java.util.Scanner;

public class RevStriing {
	public static  String revStr(String str)
	{
		String res="";
		char[] ch=str.toCharArray();
		for (int i =  ch.length-1; i >=0; i--) {
			res=res+ch[i];
			
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String value :");
		String s=sc.nextLine();
		System.out.println(revStr(s));

	}

}
