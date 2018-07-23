package com.jsp.apti;

import java.util.Scanner;

public class Triangle6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Eneter no :");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int c=1;
		for(int rows=0;rows<n;rows++)
		{
			for(int col=0;rows>=col;col++)
			{
				if(c%2!=0)
							
					System.out.print(" "+c++);
				else
					c++;
				
				
				
			}
			System.out.println();
		}

	}

}
