/**
 * 
 */
package com.peol.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Exalca {
	public static void deleteDup(ArrayList al) {
		StringBuilder[] arr=new StringBuilder[al.size()];
		int k=0;
		ArrayList<StringBuilder> list=new ArrayList<StringBuilder>();
		for (Object obj : al) {
			String str=obj.toString();
			char[] ch=str.toCharArray();
			Set<Character> setchar=new HashSet<Character>();
			for (int i = 0; i < ch.length; i++) {
				
				setchar.add(ch[i]);
			}
			
			StringBuilder res=new StringBuilder();
			for (Character c : setchar) {
				res.append(c);
			}
			//System.out.println(res);
			
			arr[k]=res;
			k++;
		}
		for (int i = 0; i < arr.length-1; i++) {
		if(arr[i].equals(arr[i+1])) {
			System.out.println("anagram");
		}else {System.out.println("not anagram");}
		}
		
	}

	
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add("aaabb");
		al.add("abb");
		al.add("ab");
		al.add("bbbaab");
		deleteDup(al);
	}

}
