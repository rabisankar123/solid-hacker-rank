package com.peol.test;

public class Freedom {
	public static String separateStrNum(String str) {
		char ch[]=str.toCharArray();
		String res1="";
		String res2="";
		
		for (int i = 0; i < ch.length; i++) {
			while(i<ch.length) {
				if((ch[i]>=65&&ch[i]<=91)||(ch[i]>=97&&ch[i]<=123)) {
					res1+=ch[i];
					i++;
				} else 	{
					res2+=ch[i];
					i++;
				}
			}
		}
		return res2+res1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="15Aug1947";
		System.out.println(separateStrNum(str));
		

	}

}
