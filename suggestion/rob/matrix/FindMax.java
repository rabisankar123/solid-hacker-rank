package com.rob.matrix;

import java.util.Scanner;

public class FindMax {
	public static int daiMax;
	public static void daiMax(int[][] arr)
	{
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(j<i)
				{
					if(daiMax<arr[i][j])
					{
					daiMax=arr[i][j];
					}
				}
			}
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int [][] arr=new int[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				arr[i][j]=sc.nextInt();			}
			
		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
			System.out.print(arr[i][j]);	
			}
			System.out.println();
			
		}
		daiMax(arr);
		System.out.println(daiMax);
	}

}
