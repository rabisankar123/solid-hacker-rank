package com.rob.string;

public class StrRotation {
	public static String  rotation(String str) {
		char[] ch=str.toCharArray();
		String res = null;
		
		for (int i = ch.length-1; i >=0; i--) {
			int count=i;
			while(count>=0&&ch[count]!=' ') {
				count--;
			}
			
			while(count<i&& count>=0) {
				res+=ch[count];
				count++;
			}
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(rotation("this is java"));
	}

}
