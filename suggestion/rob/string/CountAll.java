package com.rob.string;

public class CountAll {
	private static void countTotal(String str) {
		// TODO Auto-generated method stub
		int count_word=0;
		char[] ch=str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if(ch[i]>=65&&ch[i]<=91||ch[i]>=97&&ch[i]<=123)
			{
				count_word++;
			}
		}
		System.out.println(count_word);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		countTotal("Hello java");
	}

}
