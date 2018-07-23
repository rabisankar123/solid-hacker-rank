package com.jsp.apti;

import java.util.Scanner;

public class Armstrong1_1000 {

	
		public static int CountOfDigit(int num)
		{
			int count=0;
			while(num>0)
			{
				count++;
				num=num/10;
				
			}
			return count;
		}
		public static void isArmStrong(int num, int count)
		{
			int temp=num;
			int res=0;
			while(num>0)
			{
				int rmd=num%10;
				res=res+pow(rmd,count);
				num=num/10;
			}
			if(temp==res)
			{
				System.out.println(temp);
			}
			
		}
		
		
		
		public static int pow(int num, int pwr)
		{
			int res=1;
			for (int i = 0; i < pwr; i++) {
				
				res=res*num;
			}
			return res;
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			
			//System.out.println("Enter the number :");
			//int num=sc.nextInt();
			//int cl=CountOfDigit(num);
			//System.out.println(cl);
			
			
			for (int i = 0; i < 10000; i++) {
				int cl=CountOfDigit(i);
				isArmStrong(i,cl);
			}
	}

}
