package com.company.test;

import java.util.Scanner;

public class RmvVowel {
	public static String removingVowel(String str) {
		String res="";
		char [] ch=str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if(ch[i]!='o'&&ch[i]!='O'&&ch[i]!='a'&&ch[i]!='A'&&
					ch[i]!='e'&&ch[i]!='E'&&ch[i]!='i'&&
					ch[i]!='I'&&ch[i]!='u'&&ch[i]!='U')
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
		System.out.println(removingVowel(str));
		sc.close();
	}


}
