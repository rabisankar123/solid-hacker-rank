package com.rob.string;
/*
 * abbcdb
 * a1b2c1d1b1
 */

public class AlphaCount {
	
	public static void digitCount(String str) {
		char[] ch=str.toCharArray();
		String res="";
	
		for (int i = 0; i < ch.length-1; i++) {
			int count=1;
			if(ch[i]==ch[i+1]) {
				count++;
				i++;
				
			
			}
			res+=ch[i]+""+count;
		}
		System.out.println(res);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="abbcdbdd";
		digitCount(str);
	}

}
