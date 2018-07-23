package com.collection.parctice;
import java.util.*;
public class StrToStrarr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list=new ArrayList<String>();
		String str="india is my country";
		char[] ch=str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			String res="";
			while(i<ch.length&&ch[i]!=' ') {
				res+=ch[i];
				i++;
				}
			list.add(res);
		}
		//System.out.println(list);
		String out="";
		for (int i = 0; i < list.size(); i++) {
			String res1=list.get(i);
			if(i%2!=0) {
				for (int j = res1.length()-1; j >=0 ; j--) {
					out+=res1.charAt(j);
				}
				} else {
					out+=res1;
				}
			out+=" ";
			}
		System.out.println(out);
	}

}
