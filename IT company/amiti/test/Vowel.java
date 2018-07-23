package com.amiti.test;

public class Vowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="raviedu";
		String res="";
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i)=='a'
					||str.charAt(i)=='e'||str.charAt(i)=='i'
					||str.charAt(i)=='o'||str.charAt(i)=='u') {
				res+=str.charAt(i);
			}
		}
		System.out.println(res);
		//System.out.println((int)res.charAt(1));
		char[] ch1=res.toCharArray();
		//char[] ch=new char[res.length()];
		int k=0;
		for (int i = 0; i < ch1.length; i++) {
			for (int j = 1; j < ch1.length-1; j++) {
				
				if(ch1[j-1]>ch1[j]){
					int temp=ch1[j-1];
					ch1[j-1]=ch1[j];
					ch1[j]=(char) temp;
				}
			}
		}
		for (int i = 0; i < ch1.length; i++) {
			System.out.print(ch1[i]);
		}
	}

}
