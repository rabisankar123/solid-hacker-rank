package com.apti.sort;

import java.util.Scanner;

public class DelDpulicate {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of the array");
		int size=sc.nextInt();
		int ar[]=new int[size];
		//int esum=0,osum=0;
		for (int i = 0; i < ar.length; i++) {
			System.out.println("enter the value "+i+" position");
			ar[i]=sc.nextInt();
		
		}
		
		int n=ar.length;
		for (int i = 0; i < n; i++) {
			int count=0;
			for (int j = i+1; j < n; j++) {
				if(ar[i]==ar[j])
				{
					count++;
					int k=j;
					while(k<n-1)
					{
						ar[k]=ar[k+1];
						k++;
					}
					n--;
					j--;
				}
				
			}
		}
		for (int i = 0; i < n; i++) {
			System.out.println(ar[i]);
			
		}
	}

}
