package com.peol.test;

import java.util.Scanner;

public class Anagram {
	public static void duplicateStr(String[] strarr)
	{
		for (int i = 0; i < strarr.length; i++) {
			
			String str1=strarr[i];
			String str2="";
			for (int j = 0; j < str1.length(); j++) {
				
				for (int k = j+1; k < str1.length(); k++) {
					if(str1.charAt(j)!=str1.charAt(k)) {
				
					str2=str2+str1.charAt(j);
					}
					
					//System.out.println(str2);
				}
			}
			System.out.println(str2);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String[] str=new String[3];
		for (int i = 0; i < 3; i++) {
			str[i]=sc.next();
		}
		duplicateStr(str);
	}

}
