package com.apti.array;

import java.util.Scanner;


public class BigConSum {
	public static int bigSum(int[] arr)
	{
		int max_so_far=0;
		int max_ending_here=0;
		for (int i = 0; i < arr.length; i++) {
			max_ending_here+=arr[i];
			if(max_ending_here<0)
			{
				max_ending_here=0;
			}
			if(max_so_far<max_ending_here)
			{
				max_so_far=max_ending_here;
			}
		}
		return max_so_far;
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
		int s=bigSum(ar);
		System.out.println(s);
	}
}
