package com.jsp.apti;

import java.util.Scanner;

public class Abc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Eneter no :");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int rows=0;rows<n;rows++)
		{
			for(int i=0;i<n;i++)
			{
				
				for(int j=0;j<n;j++)
				{
					if(j==0||j==n-1&&i!=0&&i!=n-1&&i!=n/2
							||i==n-1&&j!=n-1||i==0&&j!=n-1||i==n/2&&j!=n-1)
					
						System.out.print("* ");
					
					else
					
						System.out.print("  ");
					
					
				}
				System.out.println();
				
			}
			for(int col=0;col<n;col++)
			{
				if(col==0||col==n-1&&rows!=0&&rows!=n-1&&rows!=n/2
						||rows==n-1&&col!=n-1||rows==0&&col!=n-1||rows==n/2&&col!=n-1)
				
					System.out.print("* ");
				
				else
				
					System.out.print("  ");
				
				
			}
			
				System.out.println();
		}
		
		for(int i=0;i<n;i++)
		{
			
			for(int j=0;j<n;j++)
			{
				if(j==0||j==n-1&&i!=0&&i!=n-1&&i!=n/2
						||i==n-1&&j!=n-1||i==0&&j!=n-1||i==n/2&&j!=n-1)
				
					System.out.print("* ");
				
				else
				
					System.out.print("  ");
				
				
			}
			System.out.println();
			
		}
	}

}
