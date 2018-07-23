package com.peol.test;

import java.util.Scanner;
/*
 * i/p- this is my con
 * o/p-sith is ym con
 */

public class RevOddPos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.nextLine();
		revString(str);
	}
	public static void revString(String str) {
		String res="";
		char[] ch=str.toCharArray();
		int count=1;
		
		
		
		for (int i = 0; i < ch.length; i++) {
			int k=i;
			if(count%2==0) {
		while(i<ch.length&& ch[i]!=' ') {
			i++;
		}
		int j=i-1;
		//System.out.println(j);
		while(j>=k) {
			res=res+ch[j];
			j--;
		}
		}else {
			while(i<ch.length&& ch[i]!=' ') {
				res=res+ch[i];
				i++;
			}
		}
		
		
		res+=' ';
		if(i<ch.length&&ch[i]==' ')
		{
			count++;
		}
		}
		
	
		System.out.println(res);
	}

}
