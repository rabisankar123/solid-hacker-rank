package com.peol.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class UsingItaretor {
	public static String changeCharNo(String str) {
		ArrayList al=new ArrayList();
		char[] ch1=str.toCharArray();
		for (int i = 0; i < ch1.length; i++) {
			al.add(ch1[i]);
		}
		
		String res1="";
		String res2="";
		Iterator itr=al.iterator();
		while(itr.hasNext()) {
			char ch=(char) itr.next();
			if(ch>=48&& ch<=58) {
				res1+=ch;
			} else {
				res2+=ch;
			}
		}
		System.out.println(res1);
		System.out.println(res2);
		return res1+res2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="15Aug1947";
		System.out.println(changeCharNo(str));
	}

}
