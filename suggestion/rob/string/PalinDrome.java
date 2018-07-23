package com.rob.string;

import java.util.Scanner;

public class PalinDrome {
	public static void checkPalin(String str) {
		int count=1;
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i)==' ') {
				count++;
			}
		}
		System.out.println(count);
		char[] ch=str.toCharArray();
		
		for (int i = 0; i < ch.length; i++) {
			String res="";
			while(i<ch.length&&ch[i]!=' '&&ch[i]>65&&ch[i]<121) {
			res+=ch[i];
			i++;
			//System.out.println("kkk");
			}
				
				System.out.println(res);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
	        String A=sc.nextLine();
	        
	        checkPalin(A);
	}

}
