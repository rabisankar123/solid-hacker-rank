package com.apti.array;

import java.util.Scanner;

public class NthMaxNo {
	public static int[] max(int [] arr)
	{
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr;
		
	}
//wap to find a first 2 max no in a given array

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
		System.out.println("Enter the nth pos :");
		int n=sc.nextInt();
		int[] max=max(ar);
		for (int i = 0; i < max.length; i++) {
			System.out.println(max[i]);
		}
		System.out.println(n+"th max :"+max[n-1]);
		
	}//wap to find the first 3 max

}
