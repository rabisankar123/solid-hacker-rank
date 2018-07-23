package com.apti.array;

import java.util.Scanner;

public class Arrray2d {
	static int [][] arr=new int[3][3];
	static int UTMAX=0;
	static int LTMAX=0;
	static int DMAX=0;
	private static void findMax(int[][] arr) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < 2; i++) {
			for (int j = 1; j < 3; j++) {
				UTMAX=arr[i][j];
				if(j>i)
				{
					if(UTMAX<arr[i][j])
					{
						UTMAX=arr[i][j];
					}
					
					
				}
							
			}
			
			
		}
		System.out.println("Upper Digonal Max"+UTMAX);	
		
		for (int i = 1; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				LTMAX=arr[i][j];
				if(j<i)
				{
					
					if(LTMAX<arr[i][j])
					{
						LTMAX=arr[i][j];
					}
					
					
				}
							
			}
			
			
		}
		System.out.println("Lower Digonal Max"+LTMAX);
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				DMAX=arr[i][j];
				if(j==i)
				{
					
					if(DMAX<arr[i][j])
					{
						DMAX=arr[i][j];
					}
					
					
				}
							
			}
			
			
		}
		System.out.println(" Digonal Max"+DMAX);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				arr[i][j]=sc.nextInt();
				
			}
			
			
		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(arr[i][j]+"  ");
				
			}
			System.out.println();
			
			
		}
		findMax(arr);
	}
	

}
