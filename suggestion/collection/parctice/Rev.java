package com.collection.parctice;
import java.util.*;

public class Rev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list=new ArrayList<String>();
		String str="belife in your self";
		String[] res=str.split("\\ \\s*");
		String out="";
		for (int i = 0; i < res.length; i++) {
			if(i%2!=0) {
				for (int j = res[i].length()-1; j >=0 ; j--) {
					out+=res[i].charAt(j);
				}
				} else {
					out+=res[i];
				}
			out+=" ";
			}
		System.out.println(out);
		}
	

}
