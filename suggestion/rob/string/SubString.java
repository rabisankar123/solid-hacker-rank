package com.rob.string;

import java.util.Scanner;

public class SubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str1=sc.nextLine();
		System.out.println("Enter the sub String");
		String str2=sc.nextLine();
		subStringDemo(str1,str2);
	}
	private static void subStringDemo(String s1, String s2) {
		
		int j=0;
		char ch1[]=s1.toCharArray();
		char ch2[]=s2.toCharArray();
		
		for (int i = 0; i < ch1.length; i++) {
			
		
		while(j<s2.length()&&ch1[i]==ch2[j])
		{
			j++;
			
			
		}
		
		}
		if(j==s2.length())
		{
			System.out.println(s2+" is substring");
			System.out.println("length of substring :"+s2.length());
		}
		else {
			System.out.println("not");
		}
		
		

	}

}
