package com.apti.array;

import java.util.Scanner;


public class MaxnoArray {
	public static int max(int [] arr)
	{
		int max=arr[0];
		int index = 0;
		for (int i = 1; i < arr.length; i++) {
			if(max<arr[i])
			{
				max=arr[i];
				index =i;
			}
			
		}
		System.out.println("Index is"+index);
		return max;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of the array");
		int size=sc.nextInt();
		int ar[]=new int[size];
		for (int i = 0; i < ar.length; i++) {
			System.out.println("enter the value "+i+" position");
			ar[i]=sc.nextInt();
			
		}
		int max=max(ar);
		System.out.println(max);

	}//wap to find a first 2 max no in a given array
}
