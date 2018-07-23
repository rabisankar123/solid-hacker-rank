package com.sunfra.test;

import java.util.Scanner;

public class ParfectNo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :");
		int n=sc.nextInt();
		int res=0;
		for (int i = 1; i < n; i++) {
			if(n%i==0)
				res+=i;
				
		}
		if(res==n) {
			System.out.println("perfect No");
		} else {
			System.out.println("not a perfect No");
		}

	}

}
