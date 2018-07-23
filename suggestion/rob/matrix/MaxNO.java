package com.rob.matrix;

import java.util.Scanner;

public class MaxNO {
	public static void maxRow(int[][] arr)
	{
		for (int i = 0; i < arr.length; i++) {
			int max=0;
			for (int j = 0; j < arr.length; j++) {
				if(max<arr[i][j])
				{
					max=arr[i][j];
				}
			}
			System.out.println("Max value of "+i+"th is :"+max);
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
		maxRow(arr);
	}
}
