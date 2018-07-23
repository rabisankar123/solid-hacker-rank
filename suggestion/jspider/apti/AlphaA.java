package com.jsp.apti;
import java.util.Scanner;

public class AlphaA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Eneter no :");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int rows=0;rows<n;rows++)
		{
			for(int col=0;col<=n;col++)
			{
				if(col==0||rows==0||col==n||rows==n/2)
				
					System.out.print("* ");
				
				else
				
					System.out.print("  ");
				
				
			}
			System.out.println();
		}
	}

}
