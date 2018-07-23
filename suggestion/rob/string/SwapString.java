package com.rob.string;
/*
 * i/p-s1=ravi
 * s2=swag
 * o/p-s1=swag
 * s2=ravi
 */
public class SwapString {
	public static void stringswaping(String str1, String str2) {
		int len1=str1.length();
		int len2=str2.length();
		for (int i = 0; i < str2.length(); i++) {
			str1+=str2.charAt(i);
		}
		str2="";
		for (int i = 0; i <len1; i++) {
			str2+=str1.charAt(i);
			
		}
		char[] ch=str1.toCharArray();
		for (int i = len1; i < ch.length; i++) {
			int k=0;
			ch[k++]=ch[i];
		}
		for (int i = 0; i < len2; i++) {
			str1+=ch[i];
		}
		
		System.out.println("str1 ="+str1+" str2= "+str2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="ravi";
		String str2="swag";
		stringswaping(str1,str2);
	}

}
