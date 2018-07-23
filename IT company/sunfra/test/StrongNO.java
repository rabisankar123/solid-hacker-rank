package com.sunfra.test;

import java.util.Scanner;

public class StrongNO {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :");
		int n=sc.nextInt();
		int res=0;
		int temp=n;
		while(n!=0) {
			int rem=n%10;
			res+=fact(rem);
			n=n/10;
		}
		System.out.println(res);
		if(res==temp) {
			System.out.println("Strong No");
		} else {
			System.out.println("Not Strong No");
		}

	}
	public static int fact(int rem) {
		int rs=1;
		for (int i = rem; i >0; i--) {
			rs*=i;
		}
		
		return rs;
	}

}
