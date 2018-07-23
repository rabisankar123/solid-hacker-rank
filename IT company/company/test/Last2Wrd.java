package com.company.test;

import java.util.Scanner;

public class Last2Wrd {

	public static String findLast2Wrd(String str) {
		String res="";
		int count=0;
		
		char [] ch=str.toCharArray();
		for (int i = ch.length-1; i >=0 ; i--) {
			int m=i;
			if(count<2) {
			while(i>=0&&ch[i]!=' ') {
				i--;
					
			}
			int k=i+1;
			while(k<=m) {
				res+=ch[k];
				k++;
			}
			res+=' ';
			}
			count++;
			
		}
			
		
		return res;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String value :");
		String str=sc.nextLine();
		System.out.println(findLast2Wrd(str));
		sc.close();
}
}
