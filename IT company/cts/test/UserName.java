package com.cts.test;
import java.util.*;
public class UserName {
	public static boolean lengthEqual(String str) {
		if(str.length()>8&&str.length()<30) {
			return true;
		} else {
			return false;
		}
	}
	public static boolean alphaNumeric(String str) {
		char[] ch=str.toCharArray();
		int f1=0,f2=0;
		for (int i = 0; i < ch.length; i++) {
			if(ch[i]>=65&&ch[i]<=91) {
				f1=1;
			}
			if(ch[i]>=97&&ch[i]<=121) {
				f2=1;
			}
		}
		if(f1==1&&f2==1) {
			return true;
		} else {
			return false;
		}
		
	}
	public static boolean specialChar(String str) {
		char[] ch=str.toCharArray();
		int u=0;
		for (int i = 0; i < ch.length; i++) {
			if(ch[i]!='_'&&ch[i]!=' '&&ch[i]>=65&&ch[i]<=90&&ch[i]>=97&&ch[i]<=122) {
				u++;
			}
		} 
		if(u==0) {
			return true;
		}else {
			return false;
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		ArrayList<String> al=new ArrayList<String>();
		for (int i = 0; i < n; i++) {
			al.add(sc.next());
		}
		for (int i = 0; i < al.size(); i++) {
			String str=al.get(i);
			if(lengthEqual(str)) {
				if(alphaNumeric(str))
				{
					if(specialChar(str)) {
						System.out.println("Valid");
					}else {
						System.out.println("Invalid");
					}
				}else {
					System.out.println("Invalid");
				}
			} else {
				System.out.println("Invalid");
			}
			
		}
	}

}
