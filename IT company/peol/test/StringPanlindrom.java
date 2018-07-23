package com.peol.test;

import java.util.Scanner;

public class StringPanlindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.nextLine();
		boolean b=checkPalindrom(str);
		if(b) {
			System.out.println("palindrom");
		} else {
			System.out.println("not palindrom");
		}
	}
	public static boolean checkPalindrom(String str1) {
		String str2="";
		char[] ch=str1.toCharArray();
		//System.out.println(ch.length);
		
		//System.out.println(count);
		
		for (int i = ch.length-1; i >=0 ; i--) {
			int k=i;
			while(i>=0&&ch[i]!=' ') {
				//System.out.println("Hi");
				i--;
			}
			int j=i+1;
			//System.out.println(j);
			while(j<=k) {
				str2+=ch[j];
				j++;
				
			}
			
			str2+=' ';
			
		}
		System.out.println(str2);
		if(str1.equals(str2)) {
			return true;
		} else {
			return false;
		}
		
	}

}
