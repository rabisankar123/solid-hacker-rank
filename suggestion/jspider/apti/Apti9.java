package com.jsp.apti;

import java.util.Scanner;

public class Apti9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Eneter no :");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int count=1;
		for(int rows=0;rows<n;rows++)
		{
			
			for(int col=0;rows>=col;col++)
			{
				
			
			System.out.print((count++)+" ");
				
				
			}
			
			System.out.println();
		}
		int count1=3;
		
		for(int rows=1;rows<n;rows++)
		{
			
			for(int col=0;rows+col<=n-1;col++)
			{
				
			
			System.out.print((count1--)+" ");
				
				
			}
			
			System.out.println();
		}
	}

}
