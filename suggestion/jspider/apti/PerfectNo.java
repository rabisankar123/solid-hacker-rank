package com.jsp.apti;

import java.util.Scanner;

public class PerfectNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		System.out.println("Enter the number :");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		int sum=0;
		for (int i = 1; i < num; i++) {
			if(num%i==0)
			{
				sum=sum+i;
			}
		}
		if(num==sum)
		{
			System.out.println("Perfect Number");
		}
		else
			System.out.println("Not Perfect Number");
		
	}

}
