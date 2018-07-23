package com.rob.string;

public class FandL {
	private static void changeWord(String s) {
		// TODO Auto-generated method stub
		char[] ch=s.toCharArray();
		String str="";
		char temp=ch[0];
		ch[0]=ch[ch.length-1];
		ch[ch.length-1]=temp;
		for (int i = 0; i < ch.length; i++) {
			str+=ch[i];
		}
		System.out.println(str);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		changeWord("java");
	}

}
