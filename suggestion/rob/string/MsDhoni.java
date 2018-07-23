package com.rob.string;

public class MsDhoni {
	public static void sortName(String str) {
		char[] ch=str.toCharArray();
		String res="";
		for (int i = 0; i < ch.length; i++) {
			int j=i;
			while(i<str.length()&&ch[i]!=' ') {
				i++;
			}
			int a=ch[j]-32;
			res=res+(char)a+'.';
			
		}
		int len=ch.length-1;
		while(ch[len]!=' ') {
			len--;
		}
		int k=len+2;
		for (int i = k; i < ch.length; i++) {
			res+=ch[i];
		}
		char ch1[]=res.toCharArray();
		for (int i = ch1.length-1; i >0; i--) {
			if(ch1[i]=='.') {
				int m=i;
				while(m<ch1.length-1)
				{
					ch1[m]=ch1[m+1];
					m++;
				}
				break;
			}
		}
		String result="";
		for (int i = 0; i < ch1.length-1; i++) {
			result+=ch1[i];
		}
		System.out.println(result);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="mahendra singh dhoni";
		sortName(str);
	}

}
