package com.jsp.apti;

import java.util.Scanner;

public class AlphaR1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Eneter no :");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int rows=0;rows<n;rows++)
		{
			for(int col=n/2;col<n;col++)
			{
				if(rows==0&&col!=n-1||col==n/2||rows==n/2&&col!=n-1
						||rows==col||col==n-1&&rows<n/2&&rows!=0)
				
					System.out.print("* ");
				
				else
				
					System.out.print("  ");
				
				
			}

				System.out.println();
			
		}

	}

}
