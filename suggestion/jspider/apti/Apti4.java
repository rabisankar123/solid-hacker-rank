package com.jsp.apti;

import java.util.Scanner;

public class Apti4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Eneter no :");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count1=65;
		int count2=97;
		for(int rows=0;rows<n;rows++)
		{
			
			for(int col=0;rows>=col;col++)
			{
				
				
				
				System.out.print((char)(count1--)+"");
				System.out.print((char)(count2--)+" ");
				
					
				
			}
			count1=count1+(2*rows)+n-1;
			count2=count2+(2*rows)+n-1;
			System.out.println();
		}


	}

}
