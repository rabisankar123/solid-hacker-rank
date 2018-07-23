package com.rob.string;

import java.util.Scanner;

public class Anagrame {
	public static void findAnagrame(String str1, String str2) {
		if(str1.length()!=str2.length()) {
			System.out.println("not anagrame");
		}
		int not_found=0;
		for (int i = 0; i < str1.length(); i++) {
			int found=0;
			for (int j = 0; j < str2.length(); j++) {
				if(str1.charAt(i)==str2.charAt(j)||str1.charAt(i)-32==str2.charAt(j)||str1.charAt(i)+32==str2.charAt(j))
				{
					found=1;
				}
			}
			if(found==0) {
				not_found=1;
				break;
			}
		}
		if(not_found==1) {
			System.out.println("not");
		}
		else {
			System.out.println("it is anagrame");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stubSystem.in
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st String :");
		String str1=sc.nextLine();
		System.out.println("Enter 2st String :");
		String str2=sc.nextLine();
		findAnagrame(str1,str2);
		
		

	}

}
