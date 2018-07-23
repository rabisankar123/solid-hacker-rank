package com.cts.test;

public class FastMatching {
	 
	public static void main(String[] args) {
		String str="java is java";
		findChar(str);
		

	}
	public static void findChar(String str) {
		char FAST_MATCH='a';
		 char FAST_UMATCH='a';
		char[] ch=str.toCharArray();
		int c1=0,c2=0;
		for (int i = 0; i < ch.length; i++) {
			for (int j =i+1; j < ch.length; j++) {
				if(ch[i]==ch[j]&&c1==0) {
					FAST_MATCH=ch[i];
					c1++;
					i++;
				} else if(ch[i]!=ch[j]&&c2==0) {
					FAST_UMATCH=ch[i];
					c2++;
					i++;
				}
			}
		}
		System.out.println(FAST_MATCH+" "+FAST_UMATCH);
		
		}
		
	

}
