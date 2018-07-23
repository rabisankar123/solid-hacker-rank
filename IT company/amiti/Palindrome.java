package com.amiti;

import java.util.Iterator;
import java.util.LinkedList;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList lk=new LinkedList();
		lk.add("a");
		lk.add("b");
		lk.add("c");
		lk.add("c");
		lk.add("b");
		lk.add("a");
		Iterator ita=lk.iterator();
		String str="";
		while(ita.hasNext()) {
			str+=ita.next();
		}
		System.out.println(str);
		int len=str.length()/2;
		String str1="";
		String str2="";
		//System.out.println(str.);
		str1+=str.substring(0, len);
		for (int i = str.length()-1; i >=len ; i--) {
			str2+=str.charAt(i);
		}
		System.out.println(str1);
		System.out.println(str2);
		//str2=str.substring(str.length()-1,len+1);
		if(str1.equals(str2)) {
			System.out.println("palindrom");
		} else {
			System.out.println("not palindrome");
		}
		

	}

}
