package com.jsp.apti;

import java.util.Scanner;

public class Stronnumber {
	public static void isStrong(int num)
	{
		int temp=num;
		int res=0;
		while(num>0)
		{
			int rem=num%10;
			res=res+isFact(rem);
			num=num/10;
		}
		
		if(temp==res)
		{
			System.out.println(temp);
		}
		
	}
	public static int isFact(int num)
	{
		int fact=1;
		while(num>1)
		{
			fact=fact*num;
			num--;
		}
		return fact;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main Started");
	for (int i = 0; i <10000; i++) {
		isStrong(i);
	}
		
	}
	

	

}
