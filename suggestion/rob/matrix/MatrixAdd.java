package com.rob.matrix;

import java.util.Scanner;

public class MatrixAdd {
	public static void addEle(int [][] arr)
	{
		
		int [][] narr=new int[4][4];
		for (int i = 0; i < arr.length; i++) {
			int sum=0;
			int sum1=0;
			for (int j = 0; j < arr.length; j++) {
				sum=sum+arr[i][j];
				sum1+=arr[j][i];
				narr[i][j]=arr[i][j];
			}
			for (int j = 3; j < narr.length; j++) {
				narr[i][j]=sum;
				narr[j][i]=sum1;
			}
		}
	
		int sum2=0;
		for (int i = 3; i < narr.length; i++) {
			
			for (int j = 0; j < narr.length; j++) {
				sum2+=narr[i][j]+narr[j][i];
				
			}
		}
		narr[narr.length-1][narr.length-1]=sum2;
		for (int i = 0; i < narr.length; i++) {
			for (int j = 0; j < narr.length; j++) {
				System.out.print(narr[i][j]+"  ");
			}
			System.out.println();
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
			System.out.print(arr[i][j]+"  ");	
			}
			System.out.println();
			
		}
		addEle(arr);

	}

}
