package com.jsp.apti;

import java.util.Scanner;

public class Apti3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Eneter no :");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=65;
		for(int rows=0;rows<n;rows++)
		{
			
			for(int col=0;rows>=col;col++)
			{
				
				
				
				System.out.print((char)(count--)+" ");
				
					
				
			}
			count=count+(2*rows)+n-1;
			System.out.println();
		}

	}

}
