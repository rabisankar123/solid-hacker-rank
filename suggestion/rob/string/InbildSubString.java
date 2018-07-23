package com.rob.string;

public class InbildSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="  hello java";
		//substring
		System.out.println(str.substring(0,1));
		//toUpperCase
		System.out.println(str.toUpperCase());
		//trim
		System.out.println(str.trim());
		//integer into string
		int i=10;
		String s="java"+i;
		String s1=String.valueOf(i);
		String s3=s1+10;
		System.out.println(s3);
		//string into integer
		String s9="10";
		int i9=10;
		i9=i9+Integer.parseInt(s9);
		System.out.println(i9);
		//Replace
		String str9="java is easy";
		String str8=str9.replace('j', 'k');
		System.out.println(str9);
		System.out.println(str8);

	}

}
