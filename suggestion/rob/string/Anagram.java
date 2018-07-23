package com.rob.string;

public class Anagram {
	public static void checkAnagram(String str1, String str2) {
		int len=0;
		if(str1.equals(str1)) {
			len=str1.length();
		} else {
			System.out.println("Not Anagram");
		}
		char[] ch1=str1.toCharArray();
		char[] ch2=str2.toCharArray();
		
		for (int i = 0; i < len; i++) {
			int count1=1, count2=1;
			for (int j = i+1; j < len; j++) {
				if(ch1[i]==ch1[j]) {
					count1++;
				}
			}
			for (int j = i+1; j < len; j++) {
				if(ch1[i]==ch2[j]) {
					count2++;
				}
			}
			System.out.println(ch1[i]+"="+count1+" "+count2);
		}
		
	}

	public static void main(String[] args) {
		String str1="madam";
		String str2="mmdaa";
		checkAnagram(str1,str2);
	}

}
