package com.apti.array;

import java.util.Scanner;

public class Fst2ndMax {
	public static int max(int [] arr)
	{
		
		int fmax = arr[0];;
		int smax=arr[1];
		for (int i = 1; i < arr.length; i++) {
			if(fmax<arr[i])
			{
				smax=fmax;
				fmax=arr[i];
				
			}
			else if(smax<arr[i])
			{
				smax=arr[i];
			}
			
		}
		System.out.println("Second max :"+smax);
		return fmax;
		
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
		int max=max(ar);
		System.out.println("1st max :"+max);
	}//wap to find the first 3 max

}
