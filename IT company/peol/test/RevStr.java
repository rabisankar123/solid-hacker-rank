package com.peol.test;

import java.util.ArrayList;
import java.util.Scanner;

public class RevStr {
	public static void revString(String str) {
		
		int count=1;
		char[] ch=str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if(ch[i]==' ') {
				count++;
			}
		}
		String[] strarr=new String[count];
		int j=0;
		for (int i = 0; i < ch.length; i++) {
			
			String res="";
			while(i<ch.length&&ch[i]!=' ') {
				
				res+=ch[i];
				
				i++;
			}
			strarr[j++]=res;					
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.nextLine();
		ArrayList al=new ArrayList();
		
		revString(str);

	}

}
