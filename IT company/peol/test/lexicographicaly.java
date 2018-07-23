package com.peol.test;

import java.util.Comparator;

/*
 *  i/p=hello
		java
		o/p-9
		No
		Hello Java
		
 */
public class lexicographicaly implements Comparator{
	public static String dictionaryFormate(String A, String B) {
		String res="";
		char ch1[]=A.toCharArray();
		char ch2[]=B.toCharArray();
		
		
		for (int i = 0; i < ch1.length; i++) {
			if(i==0) {
				char ch=(char) (ch1[0]-32);
				res+=ch;
			} else {
				res+=ch1[i];
			}
		}
		res+=" ";
		for (int i = 0; i < ch2.length; i++) {
			if(i==0) {
				char ch=(char) (ch2[0]-32);
				res+=ch;
			} else {
				res+=ch2[i];
			}
		}
		//System.out.println(res);
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String A=new String("java");
		String B=new String("java");
		int length=A.length()+B.length();
		System.out.println(length);
		int value=A.compareTo(B);
		if(value<=0)
		{
			System.out.println("No");
		} else {
			System.out.println("Yes");
		}
		System.out.println(dictionaryFormate(A, B));
		
	}

	

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		return 0;
	}

}
