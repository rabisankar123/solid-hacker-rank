package com.jsp.apti;

import java.util.Scanner;

public class Apti8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Eneter no :");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		
		for(int rows=0;rows<n;rows++)
		{
			
			for(int col=0;rows>=col;col++)
			{
				
			
			System.out.print("* ");
				
				
			}
			
			System.out.println();
		}
		
		for(int rows=1;rows<n;rows++)
		{
			
			for(int col=0;rows+col<=n-1;col++)
			{
				
			
			System.out.print("* ");
				
				
			}
			
			System.out.println();
		}

	}

}
