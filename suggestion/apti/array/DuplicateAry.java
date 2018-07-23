package com.apti.array;

import java.util.Scanner;

public class DuplicateAry {
	public static void duplicateEle(int [] arr)
	{
		int len=arr.length;
		
		for (int i = 0; i < len; i++) {
			int count=0;
			for (int j = i+1; j < len; j++) {
				if(arr[i]==arr[j])
				{
					count++;
					
					int k=j;
					while(k<len-1)
					{
						arr[k]=arr[k+1];
						k++;
					}
					len--;
				}
			}
			if(count>0)
			{
			System.out.println(arr[i]+" repeated is "+count+" times");
			}
		}
		
		for (int i = 0; i < len; i++) {
			System.out.println(arr[i]);
		}
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
		duplicateEle(ar);
		

	}
}
