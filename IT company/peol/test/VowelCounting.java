package com.peol.test;

public class VowelCounting {
	public static void countVowel(String s)
	{
		char[] ch=s.toCharArray();
		String str="";
		
		for (int i = 0; i < ch.length; i++) {
			int count=0;
			while(i<ch.length&&ch[i]!=' ')
			{
				if(ch[i]=='i'||ch[i]=='o'||ch[i]=='u') {
					count++;
				}
				str+=ch[i];
				i++;
			}
			if(count>0) {
				str+=count+" ";
			}
			else {
				str+=" ";
			}
		}
		System.out.println(str);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="This is my Country";
		countVowel(str);
	}

}
